package ru.stqa.pft.mantis.tests;

import ru.stqa.pft.mantis.model.Users;

import java.sql.SQLException;

public class Test extends BaseTest {

  @org.testng.annotations.Test
  public void testDbConnection() throws SQLException {

    System.out.println("1");

    Users user = app.db().listUsers().iterator().next();
    System.out.println(user);

  }

  }
