package ru.stqa.pft.addressbook.generators;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ContactDataGenerator {

  public static void main(String[] args) throws IOException {
    int count = Integer.parseInt(args[0]);
    File file = new File(args[1]);
    String type = args[2];

    List<ContactData> contacts = generateContacts(count);

    if (type.equals("xml")) {
      saveAsXml(contacts, file);
    }
    else if (type.equals("json")) {
      saveAsJson(contacts, file);
    }
    else {
      System.out.println("Неверный формат файла");
    }
  }

  private static void saveAsJson(List<ContactData> contacts, File file) throws IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
    String json = gson.toJson(contacts);
    Writer writer = new FileWriter(file);
    writer.write(json);
    writer.close();
  }

  // Записываем сгенерированные данные в файл xml
  private static void saveAsXml(List<ContactData> contacts, File file) throws IOException {
    XStream xstream = new XStream();
    xstream.processAnnotations(ContactData.class);
    String xml = xstream.toXML(contacts);
    Writer writer = new FileWriter(file);
    writer.write(xml);
    writer.close();
  }

  // Генерируем тестовые данные
  private static List<ContactData> generateContacts(int count) {
    List<ContactData> contacts = new ArrayList<>();
    for (int i = 0; i < count; i++){
      contacts.add(new ContactData()
              .withFirstName(String.format("first name %s", i))
              .withMiddleName(String.format("middle name %s", i))
              .withLastName(String.format("last name %s", i))
              .withAddress(String.format("address %s", i))
              .withPhoneMobile(String.format("8 900 800 7%s", i))
              .withEmail(String.format("email %s", i)));
    }
    return contacts;
  }

}
