package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends BaseTest {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().goToHomePage();
    List<ContactData> beforeContact = app.getContactHelper().getContactList();
    app.getNavigationHelper().gotoAddNewContact();
    app.getContactHelper().CreateContact(new ContactData("testname", "testmiddlename", "testLastname", "testAddress", "555555", "test@test.ru", "1"), true);
    List<ContactData> afterContact = app.getContactHelper().getContactList();
    Assert.assertEquals(beforeContact.size() + 1, afterContact.size());

  }

  @Test
  public void testContactCreation1() {

    System.out.println(app.getContactHelper().getContactList().size());
  }
}
