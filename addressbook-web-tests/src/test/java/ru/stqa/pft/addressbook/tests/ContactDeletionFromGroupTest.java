package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;

import java.io.File;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class ContactDeletionFromGroupTest extends BaseTest {

  @BeforeMethod
  public void ensurePrecondition() {

    //Проверяем наличие групп, если их нет, создаём одну
    if (app.db().groups().size() == 0) {
      app.goTo().groupPage();
      app.group().createGroup(new GroupData().withName("Katarina"));
    }

    //Проверяем наличие контактов, если их нет, создаём один
    if (app.db().contacts().size() == 0) {
      app.goTo().pageAddNewContact();
      File photo = new File("src/test/resources/Winter.jpg");
      app.contact().createContact(new ContactData().withFirstName("testname").
              withMiddleName("testmiddlename").withLastName("testLastname").
              withAddress("testAddress").withPhoneMobile("555555").withEmail("test@test.ru").withPhoto(photo));
    }
  }

  @Test
  public void testAddContactToGroup() {

    //Формириуем список контактов ДО теста
    Contacts beforeContact = app.db().contacts();

    app.goTo().HomePage();

    //Выбираем контакт
    ContactData deletedContact = beforeContact.iterator().next();

    GroupData selectedGroup = null;

    //Проверяем включён ли контакт в группы и выбираем группу, из которой будем удалять
    if (deletedContact.getGroups().size() == 0){
      selectedGroup = app.db().groups().iterator().next();
      app.contact().addContactToGroup(deletedContact.getId(), selectedGroup.getId());
      app.goTo().HomePage();
    }
    else {
      selectedGroup = deletedContact.getGroups().iterator().next();
    }

    //Удаляем выбранный контакт из группы
    app.contact().deleteContactFromGroup(deletedContact.getId(), selectedGroup.getId());
    app.goTo().HomePage();
    app.goTo().allGroup();

    //Формириуем список контактов ПОСЛЕ теста
    Contacts afterContact = app.db().contacts();

    // Сравниваем списки контактов до и после выполнения теста
    assertThat(afterContact, equalTo(beforeContact.without(deletedContact)
            .withAdded(deletedContact.removeGroup(selectedGroup))));
  }
}
