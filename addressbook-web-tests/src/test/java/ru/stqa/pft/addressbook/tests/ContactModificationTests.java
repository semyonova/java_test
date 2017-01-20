package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class ContactModificationTests extends BaseTest {

  @BeforeMethod

  public void ensurePrecondition() {

    //Проверяем наличие контактов, если их нет, создаём один
    if (app.db().contacts().size() == 0) {
      app.goTo().pageAddNewContact();
      app.contact().createContact(new ContactData().withFirstName("testname").
              withMiddleName("testmiddlename").withLastName("testLastname").
              withAddress("testAddress").withPhoneMobile("555555").withEmail("test@test.ru"));
    }
  }

  @Test
  public void testContactModification(){

    //Формириуем список контактов ДО теста
    Contacts beforeContact = app.db().contacts();

    app.goTo().HomePage();

    ContactData modifiedContact =  beforeContact.iterator().next();
    File photo = new File("src/test/resources/Winter.jpg");
    ContactData contact = new ContactData().withId(modifiedContact.getId()).
            withFirstName("jane"). withMiddleName("testmiddlename").withLastName("testLastname6").
            withAddress("testAddress").withPhoneMobile("50654").withEmail("test@test.ru").withPhoto(photo);
    app.contact().modify(contact);

    //Формириуем список контактов ПОСЛЕ теста
    Contacts afterContact = app.db().contacts();

    // Сравниваем списки контактов до и после выполнения теста
    assertThat(afterContact, equalTo(beforeContact.without(modifiedContact).withAdded(contact)));
  }

}
