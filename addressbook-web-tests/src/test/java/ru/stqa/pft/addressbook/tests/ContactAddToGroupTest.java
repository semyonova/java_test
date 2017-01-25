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
import static org.junit.Assert.assertThat;

public class ContactAddToGroupTest extends BaseTest {

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

    //Выбираем контакт
    app.goTo().HomePage();
    ContactData addedContact = beforeContact.iterator().next();

    //Проверяем включён ли контакт в группы:
    //если включён во все - выбираем пустую группу
    //если не включён в какую либо - выбираем эту группу

    Groups allGroups = app.db().groups();
    Set<GroupData> groupsOfContact = addedContact.getGroups();

    GroupData selectedGroup = null;

    if (allGroups.size() == groupsOfContact.size()) {
      app.goTo().groupPage();
      GroupData group = new GroupData().withName("Zina").withHeader("").withFooter("");
      app.group().createGroup(group);
      app.goTo().HomePage();
      Groups afterGroup = app.db().groups();
      selectedGroup = group.withId(afterGroup.stream().mapToInt((g) -> g.getId()).max().getAsInt());
    }
    else {
      for (GroupData allG : allGroups) {
        if (groupsOfContact.contains(allG))
          continue;
        else  selectedGroup = allG;
      }
    }

    //Добавляем выбранный контакт в выбранную группу
    app.contact().addContactToGroup(addedContact.getId(), selectedGroup.getId());

    //Формириуем список контактов ПОСЛЕ теста
    Contacts afterContact = app.db().contacts();

    // Сравниваем списки контактов до и после выполнения теста
    // из первоначального списка удаляем редактируемый контакт и добавляем редактируемый контакт,
    // включённый в группу, которая в свою очередь содержит редактируемый контакт
    assertThat(afterContact, equalTo(beforeContact.without(addedContact)
            .withAdded(addedContact.inGroup(selectedGroup.addContact(addedContact)))));

  }
}
