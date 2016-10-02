package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {

  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void login(String login, String password) {
    type(By.name("user"), login);
    type(By.name("pass"), password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
   // click(By.cssSelector("html"));
  }
}
