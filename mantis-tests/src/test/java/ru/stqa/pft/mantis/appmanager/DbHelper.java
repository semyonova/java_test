package ru.stqa.pft.mantis.appmanager;

import ru.stqa.pft.mantis.model.Users;

import java.sql.*;
import java.util.ArrayList;

public class DbHelper {

  public ArrayList<Users> listUsers() throws SQLException {
    Connection conn = null;

    conn = DriverManager.getConnection("jdbc:mysql://mantisbt-1.2.20:3306/bugtracker?user=root&password=");

    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("select username, email from mantis_user_table where id != 1");

    ArrayList<Users> usersList = new ArrayList<Users>();

    while (rs.next()) {
      Users us = new Users().withUsername(rs.getString("username")).withEmail(rs.getString("email"));
      usersList.add(us);
    }
    rs.close();
    st.close();
    conn.close();

    return usersList;
  }
}



