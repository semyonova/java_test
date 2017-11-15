package ru.stqa.pft.multy.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AppManager {

  private final Properties properties;
  private WebDriver wd;
  private String browser;
  private SoapHelper soap;
  private ProcedureHelper procedureHelper;


  public AppManager(String browser) {
    this.browser = browser;
    properties = new Properties();
  }

  public void init() throws IOException {
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));

    if("".equals(properties.getProperty("selenium.server"))) {
      if (browser.equals(BrowserType.FIREFOX)) {
        wd = new FirefoxDriver();
      } else if (browser.equals(BrowserType.CHROME)) {
        wd = new ChromeDriver();
      } else if (browser.equals(BrowserType.IE)) {
        wd = new InternetExplorerDriver();
      }
    }
    //для работы с удалённым сервером
    else {
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setBrowserName(browser);
      wd = new RemoteWebDriver(new URL(properties.getProperty("selenium.server")), capabilities);
    }

    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wd.get(properties.getProperty("web.baseUrl"));

    procedureHelper = new ProcedureHelper(wd);
  }

  public void stop() {
    if (wd != null) {
      wd.quit();
    }
  }

  public SoapHelper soap(){
    if (soap == null){
      soap = new SoapHelper(this);
    }
    return soap;
  }

  public ProcedureHelper procedure() {
    return procedureHelper;
  }

  public String getProperty(String key) {
    return properties.getProperty(key);
  }

  public WebDriver getDriver() {
    if (wd == null){
      wd = new FirefoxDriver();
      wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      wd.get(properties.getProperty("web.baseUrl"));
      }
      return wd;
    }
}
