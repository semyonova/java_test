package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GroupModificationTests extends BaseTest {

  @BeforeMethod
  public void ensurePrecondition() {

    if (app.db().groups().size() == 0)
    {
      app.goTo().groupPage();
      app.group().createGroup(new GroupData().withName("groups"));
    }
  }

  @Test
  public void testGroupModification() {

    //Формируем список(массив) из элементов групп До теста
    Groups beforeGroup = app.db().groups();

    app.goTo().groupPage();

    //Изменяем объект типа GroupData с id последнего элементa
    GroupData modifiedGroup = beforeGroup.iterator().next();
    GroupData group = new GroupData().withId(modifiedGroup.getId()).withName("g3").withHeader("t1").withFooter("t2");

    app.group().modify(group);

    //Проверяем количeство групп до и после выполнения теста
    assertThat(app.group().count(),equalTo(beforeGroup.size()));

    //Формируем список(массив) из элементов групп ПОСЛЕ теста
    Groups afterGroup = app.db().groups();

    // Проверяем элементы списков до и после выполнения теста
    assertThat(afterGroup, equalTo(beforeGroup.without(modifiedGroup).withAdded(group)));

    //Сравниваем список групп из БД со списком групп через интерфейс
    verifyGroupListInUA();
  }

}
