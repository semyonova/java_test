package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class AddContactToGroupTest extends BaseTest {

    @BeforeMethod
    public void ensurePrecondition() {

      //Проверяем наличие контактов, если их нет, создаём один
      if (app.db().contacts().size() == 0) {
        app.goTo().pageAddNewContact();
        app.contact().createContact(new ContactData().withFirstName("testname").
                withMiddleName("testmiddlename").withLastName("testLastname").
                withAddress("testAddress").withPhoneMobile("555555").withEmail("test@test.ru"));
      }

      //Проверяем наличие групп, если их нет, создаём одну
      if (app.db().groups().size() == 0)
      {
        app.goTo().groupPage();
        app.group().createGroup(new GroupData().withName("Katarina"));
      }
    }


    @Test
    public void testAddContactToGroup(){

      //Формириуем список контактов ДО теста
      Contacts beforeContact = app.db().contacts();

      app.goTo().HomePage();

      //Выбираем контакт
      ContactData addedContact =  beforeContact.iterator().next();
      System.out.println("   ");
      System.out.println("   ");
      System.out.println(addedContact.getId());

      //Выбираем группу
      GroupData selectedGroup = app.db().groups().iterator().next();
      System.out.println("   ");
      System.out.println("   ");
      System.out.println(selectedGroup.getId());

      //Добавляем выбранный контакт в выбранную группу
      app.contact().addContactToGroup(addedContact.getId(), selectedGroup.getId());

      //Формириуем список контактов ПОСЛЕ теста
      Contacts afterContact = app.db().contacts();

      // Сравниваем списки контактов до и после выполнения теста
      assertThat(afterContact, equalTo(beforeContact.without(addedContact).withAdded(addedContact.inGroup(selectedGroup))));
    }

}

