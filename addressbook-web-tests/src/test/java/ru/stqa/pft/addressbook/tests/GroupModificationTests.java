package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

public class GroupModificationTests extends BaseTest {

  @BeforeMethod
  public void ensurePrecondition() {
    app.goTo().groupPage();

    if (app.group().all().size() == 0) {
      app.group().createGroup(new GroupData().withName("group9"));
    }
  }

  @Test
  public void testGroupModification() {

    //Формируем список(массив) из элементов групп До теста
    Set<GroupData> beforeGroup = app.group().all();

    //Изменяем объект типа GroupData с id последнего элементa
    GroupData modifiedGroup = beforeGroup.iterator().next();
    GroupData group = new GroupData().withId(modifiedGroup.getId()).withName("g3").withHeader("t1").withFooter("t2");
    app.group().modify(group);

    //Формируем список(массив) из элементов групп ПОСЛЕ теста
    Set<GroupData> afterGroup = app.group().all();

    //Удаляем объект, который редактировали и добавляем тот же объект с отредактированными данными (id сохраняем)
    beforeGroup.remove(modifiedGroup);
    beforeGroup.add(group);

    // Проверяем элементы списков до и после выполнения теста
    Assert.assertEquals(beforeGroup, afterGroup);
  }

}
