package ru.stqa.pft.rest;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class RestTests {

  @Test
  //Тест создания нового бага в системе Bugify
  public void testCreateIssue() throws IOException {

    BaseTest.skipIfNotFixed(5);

    //Получаю список багов
    Set<Issue> oldIssues = RestHelper.getIssues();
    Issue newIssue = new Issue().withSubject("Test Buggy").withDescription("New test issue");

    //Создаю новый баг
    int IssueId = RestHelper.createIssue(newIssue);

    //Получаю список новых багов
    Set<Issue> newIssues = RestHelper.getIssues();
    oldIssues.add(newIssue.withId(IssueId));
    assertEquals(newIssues, oldIssues);
  }
}
