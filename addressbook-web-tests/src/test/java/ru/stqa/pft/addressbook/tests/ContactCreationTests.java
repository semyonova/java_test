package ru.stqa.pft.addressbook.tests;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.thoughtworks.xstream.XStream;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactCreationTests extends BaseTest {

  @DataProvider
  public Iterator<Object[]> validContactsFromXml() throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/contacts.xml")))) {
      String line = reader.readLine();
      String xml = "";
      while (line != null) {
        xml += line;
        line = reader.readLine();
      }
      XStream xstream = new XStream();
      xstream.processAnnotations(ContactData.class);
      List<ContactData> contacts = (List<ContactData>) xstream.fromXML(xml);
      return contacts.stream().map((c) -> new Object[]{c}).collect(Collectors.toList()).iterator();
    }
  }

  @DataProvider
  public Iterator<Object[]> validContactsFromJson() throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/contacts.json")))) {
      String line = reader.readLine();
      String json = "";
      while (line != null) {
        json += line;
        line = reader.readLine();
      }
      Gson gson = new Gson();
      List<ContactData> contacts = gson.fromJson(json, new TypeToken<List<ContactData>>() {
      }.getType());
      return contacts.stream().map((c) -> new Object[]{c}).collect(Collectors.toList()).iterator();
    }
  }

  @DataProvider
  public Iterator<Object[]> validContacts() throws IOException {
    List<Object[]> list = new ArrayList<Object[]>();
    File photo = new File("src/test/resources/Winter.jpg");
    list.add(new Object[]{new ContactData().withFirstName("newname1")
            .withMiddleName("middlename").withLastName("astname")
            .withAddress("testAddress").withPhoneMobile("2222")
            .withEmail("test@test.ru").withGroup("1").withPhoto(photo)});
    return list.iterator();
  }

  @Test (dataProvider = "validContactsFromJson")
  public void testContactCreation(ContactData contact) {
    app.goTo().HomePage();

    //Формируем список(массив) из элементов групп До теста
    Contacts beforeContact = app.db().contacts();

    //Создаём контакт с нужными данными
    app.goTo().pageAddNewContact();

    app.contact().createContact(contact);

    //Формируем список(массив) из элементов групп После теста
    Contacts afterContact = app.db().contacts();

    //Сравниваем размер списков контактов до и после выполнения теста
    assertEquals(beforeContact.size() + 1, afterContact.size());

    //Сравниваем списки контактов до и после выполнения теста
    assertThat(afterContact, equalTo(
            beforeContact.withAdded(contact.withId(afterContact.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
  }
}
