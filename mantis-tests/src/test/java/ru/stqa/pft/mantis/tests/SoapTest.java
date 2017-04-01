package ru.stqa.pft.mantis.tests;

import ru.stqa.pft.mantis.model.Project;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.Set;

public class SoapTest extends BaseTest {

  @org.testng.annotations.Test
  public void testGetProject() throws MalformedURLException, ServiceException, RemoteException {

    Set<Project> projects = app.soap().getProjects();
    System.out.println(projects.size());
    for (Project project: projects){
      System.out.println(project.getName());
    }
  }
}
