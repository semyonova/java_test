package ru.stqa.pft.mantis.appmanager;

import biz.futureware.mantis.rpc.soap.client.*;
import ru.stqa.pft.mantis.model.Issue;
import ru.stqa.pft.mantis.model.Project;

import javax.xml.rpc.ServiceException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SoapHelper {

  private ApplicationManager app;

  public SoapHelper(ApplicationManager app){
    this.app = app;
  }

  private MantisConnectPortType getMantisConnect() throws ServiceException, MalformedURLException {
    return new MantisConnectLocator()
            .getMantisConnectPort(new URL(app.getProperty("web.soapUrl")));
  }

  public Set<Project> getProjects() throws MalformedURLException, ServiceException, RemoteException {
    MantisConnectPortType mc = getMantisConnect();
    ProjectData[] projects = mc.mc_projects_get_user_accessible("administrator", "root");
    return Arrays.asList(projects).stream()
            .map((p) -> new Project().withId(p.getId().intValue()).withName(p.getName())).collect(Collectors.toSet());
  }

  public Issue addIssue(Issue issue) throws ServiceException, MalformedURLException, RemoteException {
    //Устанавливаем соединение с соап протоколом
    MantisConnectPortType mc = getMantisConnect();

    //Получаем список категорий, выбранного проекта по Ишью
    String[] categories = mc.mc_project_get_categories("administrator", "root", BigInteger.valueOf(issue.getProject().getId()));

    //Формируем объет ИшьюДата для соап протокола из объекта Ишью переданного в метод
    IssueData issueData = new IssueData();
    issueData.setSummary(issue.getSummary());
    issueData.setDescription(issue.getDescription());
    issueData.setProject(new ObjectRef(BigInteger.valueOf(issue.getProject().getId()), issue.getProject().getName()));
    issueData.setCategory(categories[0]);

    //Создаём баг в системе Мантис через соап протокол
    BigInteger issueId = mc.mc_issue_add("administrator", "root", issueData);

    //Преобразуем полученный баг (ИшьюДата) в объект Ишью
    return convertToIssue(issueId.intValue());
  }

  //Получаю баг по id из Мантиса и преобразую его в объект Ишью
  public Issue convertToIssue(int issueId) throws MalformedURLException, ServiceException, RemoteException {

    MantisConnectPortType mc = getMantisConnect();
    IssueData issueData = mc.mc_issue_get("administrator", "root", BigInteger.valueOf(issueId));

    return new Issue().withId(issueData.getId().intValue())
            .withSummary(issueData.getSummary())
            .withDescription(issueData.getDescription())
            .withStatus(issueData.getStatus().getName())
            .withProject(new Project().withId(issueData.getProject().getId().intValue())
                    .withName(issueData.getProject().getName()));
  }
}
