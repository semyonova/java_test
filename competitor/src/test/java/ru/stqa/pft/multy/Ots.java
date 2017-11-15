package ru.stqa.pft.multy;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class Ots {

  protected static final AppManager app
          = new AppManager(System.getProperty("browser", BrowserType.FIREFOX));

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
  }

  @Test
  private void test()throws IOException {
    app.ots().start();
    ArrayList<Tariffs> tariffsBySite = app.ots().getTariffOts();
    app.ots().tariffToExel(tariffsBySite);
  }

  @AfterSuite
  public void tearDown() {
    app.stop();
  }
}
