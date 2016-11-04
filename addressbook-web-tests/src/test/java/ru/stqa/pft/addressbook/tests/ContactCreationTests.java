package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

public class ContactCreationTests extends BaseTest {

  @Test
  public void testContactCreation() {
    app.goTo().HomePage();

    //Формируем список(массив) из элементов групп До теста
    Set<ContactData> beforeContact = app.contact().all();

    //Создаём контакт с нужными данными
    app.goTo().pageAddNewContact();
    ContactData contact = new ContactData().withFirstName("newname").
            withMiddleName("testmiddlename").withLastName("testLastname").
            withAddress("testAddress").withMobile("2222").withEmail("test@test.ru").withGroup("1");
    app.contact().createContact(contact);

    //Формируем список(массив) из элементов групп После теста
    Set<ContactData> afterContact = app.contact().all();

    //Сравниваем размер списков контактов до и после выполнения теста
    Assert.assertEquals(beforeContact.size() + 1, afterContact.size());

    //Добаваляем контакт с максимальным идентификатором в список До
    beforeContact.add(contact.withId(afterContact.stream().mapToInt((c) -> c.getId()).max().getAsInt()));

    //Сравниваем списки контактов до и после выполнения теста
    Assert.assertEquals(beforeContact, afterContact);
  }
}
