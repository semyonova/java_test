package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends BaseTest {

  @Test
  public void testContactCreation() {
    app.gotoAddNewContact();
    app.getContactHelper().fillContactForm(new ContactData("testname", "testmiddlename", "testLastname", "testAddress", "555555", "test@test.ru"));
    app.getContactHelper().submitContact();
    app.getContactHelper().returnToHomePage();
  }

}
