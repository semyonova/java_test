package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class ContactDeletionTests extends BaseTest {

  @BeforeMethod
  public void ensurePrecondition() {

    //Проверяем наличие контактов, если их нет, создаём один
    if (app.db().contacts().size() == 0) {
      app.goTo().pageAddNewContact();
      app.contact().createContact(new ContactData().withFirstName("testname").
              withMiddleName("testmiddlename").withLastName("testLastname").
              withAddress("testAddress").withPhoneMobile("555555").withEmail("test@test.ru").withGroup("test1"));
    }
  }

  @Test
  public void testContactDeletion() {

    //Формириуем список контактов ДО теста
   Contacts beforeContact = app.db().contacts();

    //Выбираем удаляемый контакт
    ContactData deletedContact = beforeContact.iterator().next();

    //Удаляем контакт
    app.contact().delete(deletedContact);
    app.goTo().HomePage();

    //Формириуем список контактов ПОСЛЕ теста
    Contacts afterContact = app.db().contacts();

    //Проверяем количeство контактов до и после выполнения теста
    Assert.assertEquals(beforeContact.size() - 1, afterContact.size());

    // Сравниваем списки контактов до и после выполнения теста
    assertThat(afterContact, equalTo(beforeContact.without(deletedContact)));
  }
}
