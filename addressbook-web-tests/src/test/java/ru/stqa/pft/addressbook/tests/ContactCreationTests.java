package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends BaseTest {

  @Test
  public void testContactCreation() {
    int beforeContact = app.getContactHelper().getContactCount();
    app.getNavigationHelper().gotoAddNewContact();
    app.getContactHelper().CreateContact(new ContactData("testname", "testmiddlename", "testLastname", "testAddress", "555555", "test@test.ru", "test1"), true);
    int afterContact = app.getContactHelper().getContactCount();
    Assert.assertEquals(beforeContact + 1, afterContact);
  }

}
