package ru.stqa.pft.rest;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Request;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class RestHelper {

  public static Executor getExecutor() {
    return Executor.newInstance().auth("LSGjeU4yP1X493ud1hNniA==", "");
  }

  public static Set<Issue> getIssues() throws IOException {
    String json = getExecutor().execute(Request.Get("http://demo.bugify.com/api/issues.json"))
            .returnContent().asString();
    JsonElement parsed = new JsonParser().parse(json);
    JsonElement issues = parsed.getAsJsonObject().get("issues");
    return new Gson().fromJson(issues, new TypeToken<Set<Issue>>(){}.getType());
  }

  public static int createIssue(Issue newIssue) throws IOException {
    String json = getExecutor().execute(Request.Post("http://demo.bugify.com/api/issues.json")
            .bodyForm(new BasicNameValuePair("subject", newIssue.getSubject()),
                    new BasicNameValuePair("description", newIssue.getDescription())))
            .returnContent().asString();
    JsonElement parsed = new JsonParser().parse(json);
    return parsed.getAsJsonObject().get("issue_id").getAsInt();
  }

  public static Issue getIssue(int newIdIssue) throws IOException {
    String jsonIssue = getExecutor()
            .execute(Request.Get(String.format("http://demo.bugify.com/api/issues/%s.json", newIdIssue)))
            .returnContent().asString();
    JsonElement pars = new JsonParser().parse(jsonIssue);
    JsonObject jsonObject = pars.getAsJsonObject();
    JsonArray issues = jsonObject.getAsJsonArray("issues");
    ArrayList<Issue> set = new Gson().fromJson(issues, new TypeToken<ArrayList<Issue>>(){}.getType());
    return set.get(0);
  }
}
