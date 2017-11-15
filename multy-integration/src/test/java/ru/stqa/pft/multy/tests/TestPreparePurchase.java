package ru.stqa.pft.multy.tests;

import org.testng.annotations.Test;

import javax.xml.soap.SOAPMessage;

import static ru.stqa.pft.multy.tests.BaseTest.app;

/**
 Сценарий проверки правильности создания извещения в КЗ
 * 1. Отправляем пакет PrepareProcedure с данными по процедуре через soap
 * 2. Получаем ответ RequestId
 * 3. Отправляем пакет CheckRequest через soap c RequestId (п.2)
 * 4. Получаем в ответ ссылку на процедуру
 * 5. Переходим по ссылке и сохраняем данные из процедуры с веб-формы
 * 6. Сравниваем данные п.1 и п.5
 */

@Test
public class TestPreparePurchase {

  private String serviceUrl = "http://demo-api.fabrikant.ru/multi-integration/easuz/method";
  private String namespaceURI = "http://api.fabrikant.ru/multi-integration/easuz/method";
  private String method = null;
  private String namespace = "met";

  //
  public void testPreparePurchase() throws Exception {


    /*//Создание пакета Создание процедуры
    SOAPMessage procedureKZ = app.soap().createSoapMSPrepareProcedure(namespaceURI, namespace);

    //Отправка запроса
    SOAPMessage responseKZ = app.soap().callSoapWebService(procedureKZ, serviceUrl);

    //Расшифровка ответа
    app.soap().printSOAPMessage(responseKZ);*/



    //Создание пакета Проверка создалась ли процедура
    SOAPMessage checkKZ = app.soap().createSoapMSCheckRequestPP(namespaceURI, namespace);

    //Отправка запроса
    SOAPMessage response = app.soap().callSoapWebService(checkKZ, serviceUrl);

    //Расшифровка ответа
    app.soap().printSOAPMessage(response);

  }








   /*
  createSoapMSPrepareProcedure();

  callSoapWebService();

  saveSoapResponsePrepareProcedure();*/

}
