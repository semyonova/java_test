package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends BaseTest {

  @BeforeMethod
  public void ensurePrecondition() {
    app.goTo().HomePage();

    //Проверяем наличие контактов, если их нет, создаём один
    if (app.contact().list().size() == 0) {
      app.goTo().pageAddNewContact();
      app.contact().createContact(new ContactData().withFirstName("testname").
              withMiddleName("testmiddlename").withLastName("testLastname").
              withAddress("testAddress").withMobile("555555").withEmail("test@test.ru").withGroup("test1"));
    }
  }

  @Test
  public void testContactDeletion() {

    //Формириуем список контактов ДО теста
    List<ContactData> beforeContact = app.contact().list();

    int index = beforeContact.size() - 1;

    //Удаляем последний в списке контакт
    app.contact().deleteContactByIndex(index);
    app.goTo().HomePage();

    //Формириуем список контактов ПОСЛЕ теста
    List<ContactData> afterContact = app.contact().list();

    //Проверяем количeство контактов до и после выполнения теста
    Assert.assertEquals(beforeContact.size() - 1, afterContact.size());

    // Сравниваем списки контактов до и после выполнения теста
    beforeContact.remove(index);
    Assert.assertEquals(beforeContact, afterContact);
  }
}
