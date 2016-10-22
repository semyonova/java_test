package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends BaseTest {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().goToHomePage();

    //Если нет ни одного контакта, то создаём новый
    if (! app.getContactHelper().isThereContact()) {
      app.getNavigationHelper().gotoAddNewContact();
      app.getContactHelper().createContact(new ContactData("testname", "testmiddlename", "testLastname", "testAddress", "555555", "test@test.ru", "test1"));
    }

    //Формириуем список контактов ДО теста
    List<ContactData> beforeContact = app.getContactHelper().getContactList();

    //Удаляем последний в списке контакт
    app.getContactHelper().deleteContactByIndex(beforeContact.size() - 1);
    app.getNavigationHelper().goToHomePage();

    //Формириуем список контактов ПОСЛЕ теста
    List<ContactData> afterContact = app.getContactHelper().getContactList();

    //Проверяем количeство контактов до и после выполнения теста
    Assert.assertEquals(beforeContact.size() - 1, afterContact.size());

    // Сравниваем списки контактов до и после выполнения теста
    beforeContact.remove(beforeContact.size() - 1);
    Assert.assertEquals(beforeContact, afterContact);
  }
}
