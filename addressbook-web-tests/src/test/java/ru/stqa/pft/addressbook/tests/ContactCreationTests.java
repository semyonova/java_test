package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends BaseTest {

  @Test
  public void testContactCreation() {
    app.gotoAddNewContact();
    app.fillContactForm(new ContactData("testname", "testmiddlename", "testLastname", "testAddress", "555555", "test@test.ru"));
    app.submitContact();
    app.returnToHomePage();
  }

}
