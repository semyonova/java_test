package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends BaseTest {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().goToHomePage();
    if (! app.getContactHelper().isThereContact()) {
      app.getNavigationHelper().gotoAddNewContact();
      app.getContactHelper().CreateContact(new ContactData("testname", "testmiddlename", "testLastname", "testAddress", "555555", "test@test.ru", "test1"), true);
    }
   // app.getContactHelper().chooseContact();
    app.getContactHelper().submitContact();
    app.getContactHelper().fillContactForm(new ContactData("testnameedit", "testmiddlename", "testLastname", "testAddress", "555555", "test@test.ru", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}
