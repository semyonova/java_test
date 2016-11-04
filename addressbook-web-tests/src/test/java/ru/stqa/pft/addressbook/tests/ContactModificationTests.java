package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

public class ContactModificationTests extends BaseTest {


  @BeforeMethod

  public void ensurePrecondition() {
    app.goTo().HomePage();

    //Проверяем наличие контактов, если их нет, создаём один
    if (app.contact().all().size() == 0) {
      app.goTo().pageAddNewContact();
      app.contact().createContact(new ContactData().withFirstName("testname").
              withMiddleName("testmiddlename").withLastName("testLastname").
              withAddress("testAddress").withMobile("555555").withEmail("test@test.ru").withGroup("test1"));
    }
  }

  @Test
  public void testContactModification(){

    //Формириуем список контактов ДО теста
    Set<ContactData> beforeContact = app.contact().all();

    ContactData modifiedContact =  beforeContact.iterator().next();
    ContactData contact = new ContactData().withId(modifiedContact.getId()).
            withFirstName("jane"). withMiddleName("testmiddlename").withLastName("testLastname6").
            withAddress("testAddress").withMobile("50654").withEmail("test@test.ru");
    app.contact().modify(contact);

    //Формириуем список контактов ПОСЛЕ теста
    Set<ContactData> afterContact = app.contact().all();

    //Контакту, который редактировали, сохраняем старый id
    //app.contact().modifyContactByOldId(index, contact);

    //Удаляем объект, который редактировали и добавляем тот же объект с отредактированными данными (id сохраняем)
    beforeContact.remove(modifiedContact);
    beforeContact.add(contact);

    // Сравниваем списки контактов до и после выполнения теста
    Assert.assertEquals(beforeContact, afterContact);
  }



}
