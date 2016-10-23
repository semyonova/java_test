package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends BaseTest {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().goToHomePage();

    //Формируем список(массив) из элементов групп До теста
    List<ContactData> beforeContact = app.getContactHelper().getContactList();

    //Создаём контакт с нужными данными
    app.getNavigationHelper().gotoAddNewContact();
    ContactData contact = new ContactData("testname", "testmiddlename", "testLastname", "testAddress", "555555", "test@test.ru", "1");
    app.getContactHelper().createContact(contact);

    //Формируем список(массив) из элементов групп После теста
    List<ContactData> afterContact = app.getContactHelper().getContactList();

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
