package ru.stqa.pft.mantis.appmanager;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HttpSession {

  private CloseableHttpClient httpclient;
  private ApplicationManager app;

  public HttpSession(ApplicationManager app) {
    this.app = app;
    //Создаём клиент и определяем для него стратегию редиректа
    httpclient = HttpClients.custom().setRedirectStrategy(new LaxRedirectStrategy()).build();
  }

  // Выполнение входа в систему
  public boolean login (String username, String password) throws IOException {

    //Создание будущего запроса
    HttpPost post = new HttpPost(app.getProperty("web.baseUrl") + "/login.php");
    List<NameValuePair> params = new ArrayList<>();
    params.add(new BasicNameValuePair("username", username));
    params.add(new BasicNameValuePair("password", password));
    params.add(new BasicNameValuePair("secure_session", "on"));
    params.add(new BasicNameValuePair("return", "index.php"));

    //Запрос сформирован и готов к отправке
    post.setEntity(new UrlEncodedFormEntity(params));

    //Получаем ответ
    CloseableHttpResponse response = httpclient.execute(post);
    String body = getTextFrom(response);

    //Проверяем вошёл ли пользователь под своей учёткой
    return body.contains(String.format("<span class=\"italic\">%s</span>", username));
  }

  //Получаем исходный код страницы
  private String getTextFrom(CloseableHttpResponse response) throws IOException {
    try{
      return EntityUtils.toString(response.getEntity());
    } finally {
      response.close();
    }
  }

  //Проверяем, что залогинены под пользователем переданным в метод
  public boolean isLoggedInAs (String username) throws IOException {
    HttpGet get = new HttpGet(app.getProperty("web.baseUrl") + "/index.php");
    CloseableHttpResponse response = httpclient.execute(get);
    String body = getTextFrom(response);
    return body.contains(String.format("<span class=\"italic\">%s</span>", username));
  }
}