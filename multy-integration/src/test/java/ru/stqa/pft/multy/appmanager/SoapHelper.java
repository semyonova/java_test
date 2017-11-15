package ru.stqa.pft.multy.appmanager;

import javax.xml.soap.*;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;

public class SoapHelper {

  private AppManager app;

  public SoapHelper(AppManager app) {
    this.app = app;
  }

  // Коннектится к сервису, отправляет сообщение и получает ответ
  // На вход - отправляемое сообщение и адрес, куда отправлять
  // На выход - ответ-сообщение от сервера
  public SOAPMessage callSoapWebService(SOAPMessage soapRequest, String url) throws SOAPException {

    SOAPConnectionFactory soapFactory  = null;
    SOAPConnection soapConnect  = null;
    SOAPMessage soapResponse = null;

    // Создание SOAP Connection
    soapFactory = SOAPConnectionFactory.newInstance();
    soapConnect = soapFactory.createConnection();

    // Получение SOAP Message
    soapResponse = soapConnect.call(soapRequest, url);

    soapConnect.close();

    return soapResponse;
  }

  public SOAPMessage createSoapMSCheckRequestPP(String namespaceURI, String namespace) throws Exception
  {
    String method = "CheckRequest";
    String soapAction = null;
    soapAction = namespaceURI + "/" + method;


    MessageFactory messageFactory = MessageFactory.newInstance();
    SOAPMessage soapMessage = messageFactory.createMessage();


    SOAPPart soapPart = soapMessage.getSOAPPart();

    // SOAP Envelope
    SOAPEnvelope envelope = soapPart.getEnvelope();
    envelope.addNamespaceDeclaration(namespace, namespaceURI);

    // SOAP Body
    SOAPBody soapBody = envelope.getBody();
    SOAPElement soapBodyElem;
    SOAPElement soapBodyElem1;
    soapBodyElem = soapBody.addChildElement(method, namespace);
    soapBodyElem1 = soapBodyElem.addChildElement("RequestId", namespace);
    soapBodyElem1.addTextNode("50bcf76135bd63e475dbfcd8e7bd8ab5");

    MimeHeaders headers = soapMessage.getMimeHeaders();
    headers.setHeader("SOAPAction", soapAction);

    soapMessage.saveChanges();

    // Печать XML текста запроса
    System.out.println("Request SOAP Message:");
    soapMessage.writeTo(System.out);
    System.out.println("\n");

    return soapMessage;
  }

  //Вывод полученного сообщения от сервера
  public void printSOAPMessage (SOAPMessage soapResponse) {
    TransformerFactory transformerFactory;
    Transformer transformer;
    try {
      // Создание XSLT-процессора
      transformerFactory = TransformerFactory.newInstance();
      transformer = transformerFactory.newTransformer();
      // Получение содержимого ответа
      Source content;
      content = soapResponse.getSOAPPart().getContent();
      // Определение выходного потока
      StreamResult result = new StreamResult(System.out);
      transformer.transform(content, result);
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public SOAPMessage createSoapMSPrepareProcedure(String namespaceURI, String namespace)
          throws SOAPException, IOException {

    String method = "PrepareProcedurePurchase";
    String soapAction = null;
    soapAction = namespaceURI + "/" + method;

    MessageFactory messageFactory = MessageFactory.newInstance();
    SOAPMessage soapMessage = messageFactory.createMessage();

    SOAPPart soapPart = soapMessage.getSOAPPart();

    // SOAP Envelope
    SOAPEnvelope envelope = soapPart.getEnvelope();
    envelope.addNamespaceDeclaration(namespace, namespaceURI);

    // SOAP Body
    SOAPBody soapBody = envelope.getBody();
    SOAPElement soapBodyElem;
    SOAPElement soapBodyElem1;
    SOAPElement soapBodyElemSub;
    SOAPElement soapBodyElemSubSub;
    soapBodyElem = soapBody.addChildElement(method, namespace);

    soapBodyElem1 = soapBodyElem.addChildElement("PurchaseId", namespace);
    soapBodyElem1.addTextNode("131324454");
    soapBodyElem1 = soapBodyElem.addChildElement("ProcedurePurchaseType", namespace);
    soapBodyElem1.addTextNode("tender");

    soapBodyElemSub = soapBodyElem.addChildElement("Purchase", namespace);
    soapBodyElemSubSub = soapBodyElemSub.addChildElement("PurchaseMode", namespace);
    soapBodyElemSubSub.addTextNode("open");
    soapBodyElemSubSub = soapBodyElemSub.addChildElement("PurchaseName", namespace);
    soapBodyElemSubSub.addTextNode("Женя");

    MimeHeaders headers = soapMessage.getMimeHeaders();
    headers.setHeader("SOAPAction", soapAction);

    soapMessage.saveChanges();

    // Печать XML текста запроса
    System.out.println("Request SOAP Message:");
    soapMessage.writeTo(System.out);
    System.out.println("\n");

    return soapMessage;

  }
}

