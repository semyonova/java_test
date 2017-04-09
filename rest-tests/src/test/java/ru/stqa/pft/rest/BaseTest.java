package ru.stqa.pft.rest;

import org.testng.SkipException;

import java.io.IOException;

public class BaseTest {

  public static boolean isIssueOpen(int id) throws IOException {
    Issue issue = RestHelper.getIssue(id);
    String stateIssue = issue.getState();
    if (stateIssue.equals("3")) {
      System.out.println(stateIssue);
      return false;
    } else {
      System.out.println(stateIssue);
      return true;
    }
  }

  public static void skipIfNotFixed(int issueId) throws IOException {
    if (isIssueOpen(issueId)) {
      System.out.print("Пропуск теста");
      throw new SkipException("Ignored because of issue " + issueId);
    }
  }
}
