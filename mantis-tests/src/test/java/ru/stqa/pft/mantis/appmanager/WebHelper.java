package ru.stqa.pft.mantis.appmanager;
import org.openqa.selenium.By;

public class WebHelper extends BaseHelper {

  public WebHelper(ApplicationManager app) {
    super(app);
  }

  //вход в систему
  public void loginWeb (String user, String password){
    wd.get(app.getProperty("web.baseUrl") + "/login_page.php");
    type(By.name("username"), user);
    type(By.name("password"), password);
    click(By.cssSelector("input[value='Login']"));
  }

  //смена пароля указанному пользователю
  public void resetPassword (String user){
    click(By.linkText("Manage"));
    click(By.linkText("Manage Users"));
    click(By.linkText(user));
    click(By.cssSelector("input[value='Reset Password']"));
  }
}
