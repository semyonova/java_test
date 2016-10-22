package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends BaseTest {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().goToHomePage();

    if (! app.getContactHelper().isThereContact()) {
      app.getNavigationHelper().gotoAddNewContact();
      app.getContactHelper().createContact(new ContactData("testname", "testmiddlename", "testLastname", "testAddress", "555555", "test@test.ru", "test1"));
    }
    List<ContactData> beforeContact = app.getContactHelper().getContactList();
    //app.getContactHelper().chooseContact(beforeContact.size() - 1);
    //app.getContactHelper().deleteContact();
    app.getContactHelper().deleteContactByIndex(beforeContact.size() - 1);
    app.getNavigationHelper().goToHomePage();
    List<ContactData> afterContact = app.getContactHelper().getContactList();
    Assert.assertEquals(beforeContact.size() - 1, afterContact.size());

    // Сравниваем списки контактов до и после выполнения теста
    beforeContact.remove(beforeContact.size() - 1);
    Assert.assertEquals(beforeContact.size(), afterContact.size());
  }
}
