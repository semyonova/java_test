package ru.stqa.pft.mantis.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.mantis.appmanager.ApplicationManager;
import ru.stqa.pft.mantis.model.Issue;

import javax.xml.rpc.ServiceException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;


public class BaseTest {

  protected static final ApplicationManager app
          = new ApplicationManager(System.getProperty("browser", BrowserType.FIREFOX));

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
    app.ftp().upload(new File("src/test/resources/config_inc.php"), "config_inc.php" , "config_inc.php.bak");
  }

  @AfterSuite
  public void tearDown() throws IOException {
    app.ftp().restore("config_inc.php.bak", "config_inc.php");
    app.stop();
  }

  //Получаю информацию о баге - открыт он или закрыт
  public boolean isIssueOpen(int issueId) throws ServiceException, MalformedURLException, RemoteException {
    Issue issue = app.soap().convertToIssue(issueId);
    if (issue.getStatus().equals("closed")) {
      System.out.println(issue.getStatus());
      return false;
    }
    else {
      System.out.println(issue.getStatus());
      return true;
    }
  }

  public void skipIfNotFixed(int issueId) throws RemoteException, ServiceException, MalformedURLException {
    if (isIssueOpen(issueId)) {
      System.out.print("Пропуск теста");
      throw new SkipException("Ignored because of issue " + issueId);
    }
  }
}
