package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.io.File;
import java.util.Set;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class AddContactToGroupTest extends BaseTest {

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
    ContactData addedContact = beforeContact.iterator().next();
    System.out.println("   ");
    System.out.println("   ");
    System.out.println(addedContact.getId());

    //Проверяем включён ли уже контакт в группы и в зависимости от этого выбираем группу

    Groups allGroups = app.db().groups();
    Set<GroupData> groupsOfContact = addedContact.getGroups();

    GroupData selectedGroup = app.contact().verifyGroupByContact(allGroups, groupsOfContact);

    //Добавляем выбранный контакт в выбранную группу

    if (selectedGroup == null) {
      app.goTo().groupPage();
      GroupData group = new GroupData().withName("Rome");
      app.group().createGroup(group);
      app.goTo().HomePage();
      Groups afterGroup = app.db().groups();
      selectedGroup = group.withId(afterGroup.stream().mapToInt((g) -> g.getId()).max().getAsInt());
      app.contact().addContactToGroup(addedContact.getId(), selectedGroup.getId());

      // Придумать, что б выбранная группа не равна была нулю, т.к. последняя проверка не прохоит
    }
    else {
      app.contact().addContactToGroup(addedContact.getId(), selectedGroup.getId());
    }

    //Формириуем список контактов ПОСЛЕ теста
    Contacts afterContact = app.db().contacts();

    // Сравниваем списки контактов до и после выполнения теста
    assertThat(afterContact, equalTo(beforeContact.without(addedContact).withAdded(addedContact.inGroup(selectedGroup))));





    /*if (addedContact.getGroups().size() == 0)
    {
     //Выбираем группу
    GroupData selectedGroup = app.db().groups().iterator().next();
    System.out.println("   ");
    System.out.println("   ");
    System.out.println(selectedGroup.getId());


    }


    if (app.db().groups().size() == addedContact.getGroups().size()) {

      app.goTo().groupPage();
      GroupData selectedGroup = new GroupData().withName("Rome");
      app.group().createGroup(selectedGroup);
      app.goTo().HomePage();
      Groups afterGroup = app.db().groups();
      int id = afterGroup.stream().mapToInt((g) -> g.getId()).max().getAsInt();
      app.contact().addContactToGroup(addedContact.getId(), id);

    } else {
      for (GroupData allG : allGroups) {
        for (GroupData groupC : groupsOfContact) {
          if (allG.getId() != groupC.getId()) {
            GroupData selectedGroup = allG;
            app.contact().addContactToGroup(addedContact.getId(), selectedGroup.getId());
          }
        }
      }
    }*/

  }
}


    /*//Выбираем группу
    GroupData selectedGroup = app.db().groups().iterator().next();
    System.out.println("   ");
    System.out.println("   ");
    System.out.println(selectedGroup.getId());

    //Добавляем выбранный контакт в выбранную группу
    app.contact().addContactToGroup(addedContact.getId(), selectedGroup.getId());



*/