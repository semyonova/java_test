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

    app.getContactHelper().modifyContactByIndex(beforeContact.size() - 1);
    ContactData contact = new ContactData(beforeContact.get(beforeContact.size() - 1).getId(),"old", "testmiddlename", "testLastname6", "testAddress", "00000", "test@test.ru", null);
    app.getContactHelper().fillContactForm(contact, false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();

    //Формириуем список контактов ПОСЛЕ теста
    List<ContactData> afterContact = app.getContactHelper().getContactList();

    //Контакту, который редактировали, сохраняем старый id
    app.getContactHelper().modifyContact(beforeContact.size() - 1, contact);

    //Упорядочиваем списки по id перед сравнением
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    beforeContact.sort(byId);
    afterContact.sort(byId);

    // Сравниваем списки контактов до и после выполнения теста
    Assert.assertEquals(beforeContact, afterContact);
  }
  
}
