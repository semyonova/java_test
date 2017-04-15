package ru.stqa.pft.competitor;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AppManager {

  private final Properties properties;
  private WebDriver wd;
  private String browser;
  private Helper helper;

  public AppManager(String browser) {
    this.browser = browser;
    properties = new Properties();
  }

  public void init() throws IOException {
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
  }

  public void stop() {
    if (wd != null) {
      wd.quit();
    }
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

  public Helper ots() {
    helper = new Helper(this);
    return helper;
  }
}
