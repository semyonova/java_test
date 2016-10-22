package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends BaseTest {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().goToHomePage();

    //Проверяем наличи контактов, если их нет, создаём один
    if (! app.getContactHelper().isThereContact()) {
      app.getNavigationHelper().gotoAddNewContact();
      app.getContactHelper().createContact(new ContactData("testname", "testmiddlename", "testLastname", "testAddress", "555555", "test@test.ru", "test1"));
    }

    //Формириуем список контактов ДО теста
    List<ContactData> beforeContact = app.getContactHelper().getContactList();

    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("testname1", "testmiddlename", "testLastname1", "testAddress", "111111", "test@test.ru", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();

    //Формириуем список контактов ПОСЛЕ теста
    List<ContactData> afterContact = app.getContactHelper().getContactList();

    //Упорядочиваем списки по id перед сравнением
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    beforeContact.sort(byId);
    afterContact.sort(byId);

    // Сравниваем списки контактов до и после выполнения теста
    Assert.assertEquals(beforeContact, afterContact);
  }
}
