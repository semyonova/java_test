package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;


public class GroupCreationTests extends BaseTest {

  @Test
  public void testGroupCreation() {
    app.goTo().groupPage();

    //Формируем список(массив) из элементов групп До теста
    Groups beforeGroup = app.group().all();

    GroupData group = new GroupData().withName("test");
    app.group().createGroup(group);

    //Формируем список(массив) из элементов групп ПОСЛЕ теста
    Groups afterGroup = app.group().all();

    //Проверяем количество групп до и после выполнения теста
    assertThat(afterGroup.size(), equalTo(beforeGroup.size() + 1));

    //Сравниваем множества ДО и ПОСЛЕ с использованием hamcrest
    assertThat(afterGroup, equalTo(
            beforeGroup.withAdded(group.withId(afterGroup.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
  }

}
