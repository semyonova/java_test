package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends BaseTest {

  @Test
  public void testContactCreation() {
    app.goTo().HomePage();

    //Формируем список(массив) из элементов групп До теста
    List<ContactData> beforeContact = app.contact().list();

    //Создаём контакт с нужными данными
    app.goTo().pageAddNewContact();
    ContactData contact = new ContactData().withFirstName("newname").
            withMiddleName("testmiddlename").withLastName("testLastname").
            withAddress("testAddress").withMobile("2222").withEmail("test@test.ru").withGroup("1");
    app.contact().createContact(contact);

    //Формируем список(массив) из элементов групп После теста
    List<ContactData> afterContact = app.contact().list();

    //Сравниваем размер списков контактов до и после выполнения теста
    Assert.assertEquals(beforeContact.size() + 1, afterContact.size());

    //Добаваляем новый контакт в список До
    beforeContact.add(contact);

    //Упорядочиваем списки по id перед сравнением
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    beforeContact.sort(byId);
    afterContact.sort(byId);

    //Сравниваем списки контактов до и после выполнения теста
    Assert.assertEquals(beforeContact, afterContact);
  }
}
