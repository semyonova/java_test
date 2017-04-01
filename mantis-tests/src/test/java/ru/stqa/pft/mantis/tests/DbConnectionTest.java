package ru.stqa.pft.mantis.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.mantis.model.Users;

import java.sql.*;
import java.util.ArrayList;

public class DbConnectionTest {

  @Test
  public void testDbConnection() {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection("jdbc:mysql://mantisbt-1.2.20:3306/bugtracker?user=root&password=");

      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery("select username, email from mantis_user_table where id != 1");

      ArrayList<Users> usersList = new ArrayList<Users>();

      while (rs.next()) {
        Users us = new Users().withUsername(rs.getString("username")).withEmail(rs.getString("email"));
        usersList.add(us);
        System.out.println(us);
      }
      rs.close();
      st.close();
      conn.close();

      Users chooseUser = usersList.iterator().next();
      System.out.println(chooseUser);

    } catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }
  }
}
