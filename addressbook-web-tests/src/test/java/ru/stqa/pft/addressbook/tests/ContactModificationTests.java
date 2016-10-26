package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends BaseTest {


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
  public void testContactModification(){

    //Формириуем список контактов ДО теста
    List<ContactData> beforeContact = app.contact().list();

    int index = beforeContact.size() - 1;
    ContactData contact = new ContactData().withId(beforeContact.get(index).getId()).
            withFirstName("jane"). withMiddleName("testmiddlename").withLastName("testLastname6").
            withAddress("testAddress").withMobile("50654").withEmail("test@test.ru");
    app.contact().modify(index, contact);

    //Формириуем список контактов ПОСЛЕ теста
    List<ContactData> afterContact = app.contact().list();

    //Контакту, который редактировали, сохраняем старый id
    //app.contact().modifyContactByOldId(index, contact);

    //Удаляем объект, который редактировали и добавляем тот же объект с отредактированными данными (id сохраняем)
    beforeContact.remove(index);
    beforeContact.add(contact);

    //Упорядочиваем списки по id перед сравнением
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    beforeContact.sort(byId);
    afterContact.sort(byId);

    // Сравниваем списки контактов до и после выполнения теста
    Assert.assertEquals(beforeContact, afterContact);
  }



}
