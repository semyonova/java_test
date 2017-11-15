package ru.stqa.pft.multy.tests;

import org.testng.annotations.Test;
import ru.fabrikant.api.multi_integration.easuz.method.EASUZIntegrationService;
import ru.fabrikant.api.multi_integration.easuz.method.ResponseData;

import javax.xml.ws.Holder;
import java.io.IOException;

public class checkProcedureTest {

  @Test
  public void testCheckProcedure() throws IOException {

    Holder<String> requestId = new Holder<>("3215ce8fcc6791f40465791bb3247e9a");
    Holder<Boolean> responseIsReady = new Holder<>();
    Holder<ResponseData> response = new Holder<>(new ResponseData());

    new EASUZIntegrationService()
            .getBasicHttpBindingIEASUZIntegrationService()
            .checkRequest(requestId, responseIsReady, response);

    System.out.println(response);


  }

}


   /* Новапорт

    InputStreamReader reader = null;

    HttpURLConnection httpConnection =
              (new HttpBasicAuthentication(
                      "http://demo-api.fabrikant.ru/multi-integration/novaport?wsdl",
                      "e.semenova",
                      "lLxIhDUXKZ")
                      .connect());

    System.out.println(httpConnection);

    System.out.println(reader = new InputStreamReader(httpConnection.getInputStream(), "UTF8"));


    Holder<String> requestId = new Holder<>("b7381cb5d12c3a68d3237fec68ef3d3b");
    Holder<Boolean> responseIsReady = new Holder<>();
    Holder<ResponseData> response = new Holder<>(new ResponseData());



    new NOVAPORTProcedureIntegration_Service()
            .getNOVAPORTProcedureIntegration()
                    .checkRequest(requestId, responseIsReady, response);
    System.out.println(response);
    //assertEquals(check.getRequestId(), "")


*/
