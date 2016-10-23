package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupModificationTests extends BaseTest {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();

    if (! app.getGroupHelper().isThereGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }

    //Формируем список(массив) из элементов групп До теста
    List<GroupData> beforeGroup = app.getGroupHelper().getGroupList();

    //Выбираем последний элемент в списке на странице
    app.getGroupHelper().selectGroup(beforeGroup.size() - 1);

    app.getGroupHelper().initGroupModification();
    //Создаём объект типа GroupData с id последнего элемента (получаем последний элемент, получаем его id)
    GroupData group = new GroupData("1", "test1", "test2", beforeGroup.get(beforeGroup.size() - 1).getId());
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();

    //Формируем список(массив) из элементов групп ПОСЛЕ теста
    List<GroupData> afterGroup = app.getGroupHelper().getGroupList();

    //Удаляем объект, который редактировали и добавляем тот же объект с отредактированными данными (id сохраняем)
    beforeGroup.remove(beforeGroup.size() - 1);
    beforeGroup.add(group);

    //Упорядочиваем списки по id перед сравнением
    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    beforeGroup.sort(byId);
    afterGroup.sort(byId);

    // Проверяем элементы списков до и после выполнения теста
    Assert.assertEquals(beforeGroup, afterGroup);
  }

}
