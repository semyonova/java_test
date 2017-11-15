package ru.stqa.pft.multy.appmanager;

import org.apache.xerces.impl.dv.util.Base64;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

  public class HttpBasicAuthentication {

    String StrUrl;
    String username;
    String password;

    public HttpBasicAuthentication(String strUrl, String username, String password) {
      this.StrUrl = strUrl;
      this.username = username;
      this.password = password;
    }

    public HttpURLConnection connect() throws IOException {
      URL url;
      url = new URL(StrUrl);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      String encodedPassword = username + ":" + password;
      String encoded = Base64.encode(encodedPassword.getBytes());
      connection.setRequestProperty("Authorization", "Basic "+ encoded);
      System.out.println(connection.getResponseCode());
      System.out.println(connection.getContent());
      return connection;
    }
  }
