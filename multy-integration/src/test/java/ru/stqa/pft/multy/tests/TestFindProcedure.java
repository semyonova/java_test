package ru.stqa.pft.multy.tests;

import org.testng.annotations.Test;

public class TestFindProcedure extends BaseTest {

  @Test
  public void TestFindProcedure() {

    //Заходим в процедуру
    app.procedure().loginFabrikant();

    //Формируем набор данных по процедуре
    app.procedure().selectProcedure();


  }
}
