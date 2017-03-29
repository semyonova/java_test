package ru.stqa.pft.mantis.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.lanwen.verbalregex.VerbalExpression;
import ru.stqa.pft.mantis.model.MailMessage;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class ChangePasswordTest extends BaseTest {

  @BeforeMethod
  public void startMailServer() {
    app.mail().start();
  }

  @Test
  public void testChangePassword() throws IOException {

    //Авторизуемся под пользователем
    String administrator = "administrator";
    String password = "root";
    app.web().loginWeb(administrator, password);

    //Отправляем ссылку на смену пароля пользователю
    String user = "Jane";
    String newPassword = "newPassword";
    app.web().resetPassword(user);

    //Получаем ссылку и пользователь меняет пароль
    List<MailMessage> mailMessages = app.mail().waitForMail(1, 10000);
    String confirmationLink = findConfirmationLink(mailMessages, "user1@localhost.localdomain");
    app.registration().finish(confirmationLink, newPassword);

    //Проверяем, что пользователь может авторизоваться с новым паролем
    assertTrue(app.newSession().login(user, newPassword));
  }

  //Среди потокока писем, находит письмо отправленное на конкретный email и возвращает ссылку из письма
  private String findConfirmationLink(List<MailMessage> mailMessages, String email) {
    MailMessage mailMessage = mailMessages.stream().filter((m) -> m.to.equals(email)).findFirst().get();
    VerbalExpression regex = VerbalExpression.regex().find("http://").nonSpace().oneOrMore().build();
    return regex.getText(mailMessage.text);
  }

  @AfterMethod(alwaysRun = true)
  public void stopMailServer() {
    app.mail().stop();
  }
}
