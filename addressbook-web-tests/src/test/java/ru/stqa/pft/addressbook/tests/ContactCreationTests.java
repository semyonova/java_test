package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactCreationTests extends BaseTest {

  @Test
  public void testContactCreation() {
    app.goTo().HomePage();

    //Формируем список(массив) из элементов групп До теста
    Contacts beforeContact = app.contact().all();

    //Создаём контакт с нужными данными
    app.goTo().pageAddNewContact();
    File photo = new File("src/test/resources/Winter.jpg");
    ContactData contact = new ContactData().withFirstName("newname")
            .withMiddleName("testmiddlename").withLastName("testLastname")
            .withAddress("testAddress").withPhoneMobile("2222")
            .withEmail("test@test.ru").withGroup("1").withPhoto(photo);
    app.contact().createContact(contact);

    //Формируем список(массив) из элементов групп После теста
    Contacts afterContact = app.contact().all();

    //Сравниваем размер списков контактов до и после выполнения теста
    assertEquals(beforeContact.size() + 1, afterContact.size());

    //Сравниваем списки контактов до и после выполнения теста
    assertThat(afterContact, equalTo(
            beforeContact.withAdded(contact.withId(afterContact.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
  }
}
