package ru.stqa.pft.multy.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProcedureHelper extends BaseHelper {

  public ProcedureHelper(WebDriver wd) {
    super(wd);
  }

  public void loginFabrikant(){
    wd.get("http://test.fabrikant.ru/trades/corporate/ProcedurePurchase/?action=view&id=10034");
    type(By.name("f_login"), "user002");
    type(By.name("f_password"), "DvaDvaDva222!");
    click(By.cssSelector("input.enter"));
  }

  public void selectProcedure() {
    String fullname = getText(By.xpath(".//div[@class='width800 break-word']"));
    System.out.println("Общее наименование закупки: " + fullname);
  }

  
}
