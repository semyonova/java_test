package ru.stqa.pft.mantis.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.lanwen.verbalregex.VerbalExpression;
import ru.stqa.pft.mantis.model.MailMessage;
import ru.stqa.pft.mantis.model.Users;

import javax.xml.rpc.ServiceException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class ChangePasswordTest extends BaseTest {

  @BeforeMethod
  public void startMailServer() throws RemoteException, ServiceException, MalformedURLException {
    //Проверяю есть ли открытый баг по данному тесту, если есть - пропускаю тест
    skipIfNotFixed(0000001);
    app.mail().start();
  }

  @Test
  public void testChangePassword() throws IOException, SQLException, ServiceException {

    //Авторизуемся под администратором
    app.web().loginWeb("administrator", "root");

    //Выбираем пользователя, которому меняем пароль
    Users user = app.db().listUsers().iterator().next();

    //Отправляем ссылку на смену пароля пользователю
    app.web().resetPassword(user.getUsername());

    //Получаем ссылку и пользователь меняет пароль
    List<MailMessage> mailMessages = app.mail().waitForMail(1, 10000);
    String confirmationLink = findConfirmationLink(mailMessages, user.getEmail());
    String newPassword = "newPassword";
    app.registration().finish(confirmationLink, newPassword);

    //Проверяем, что пользователь может авторизоваться с новым паролем
    assertTrue(app.newSession().login(user.getUsername(), newPassword));
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
