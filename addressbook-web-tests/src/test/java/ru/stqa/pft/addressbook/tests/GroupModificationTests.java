package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupModificationTests extends BaseTest {

  @BeforeMethod
  public void ensurePrecondition() {
    app.goTo().groupPage();

    if (app.group().list().size() == 0) {
      app.group().createGroup(new GroupData().withName("group9"));
    }
  }

  @Test
  public void testGroupModification() {

    //Формируем список(массив) из элементов групп До теста
    List<GroupData> beforeGroup = app.group().list();

    //Изменяем объект типа GroupData с id последнего элемента
    int index = beforeGroup.size() - 1;
    GroupData group = new GroupData().withId(beforeGroup.get(index).getId()).withName("g3").withHeader("t1").withFooter("t2");
    app.group().modify(index, group);

    //Формируем список(массив) из элементов групп ПОСЛЕ теста
    List<GroupData> afterGroup = app.group().list();

    //Удаляем объект, который редактировали и добавляем тот же объект с отредактированными данными (id сохраняем)
    beforeGroup.remove(index);
    beforeGroup.add(group);

    //Упорядочиваем списки по id перед сравнением
    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    beforeGroup.sort(byId);
    afterGroup.sort(byId);

    // Проверяем элементы списков до и после выполнения теста
    Assert.assertEquals(beforeGroup, afterGroup);
  }

}
