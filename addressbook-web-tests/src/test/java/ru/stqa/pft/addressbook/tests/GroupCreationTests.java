package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;


public class GroupCreationTests extends BaseTest {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();

    //Формируем список(массив) из элементов групп До теста
    List<GroupData> beforeGroup = app.getGroupHelper().getGroupList();
    GroupData group = new GroupData("test2", null, null);
    app.getGroupHelper().CreateGroup(group);

    //Формируем список(массив) из элементов групп ПОСЛЕ теста
    List<GroupData> afterGroup = app.getGroupHelper().getGroupList();

    //Проверяем количество групп до и после выполнения теста
    Assert.assertEquals(beforeGroup.size() + 1, afterGroup.size());

    //Находим максимальное id в списке ПОСЛЕ
    //Превращаем список в поток, сравниваем элементы и находим максимальный, получаем этот элемент, получаем его id
    //int max = afterGroup.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId();
    //Присваиваем элементу максимальный id
    //group.setId(max);

    //Добавляем элемент в список(массив) ДО
    beforeGroup.add(group);

    //Упорядочиваем списки по id перед сравнением
    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    beforeGroup.sort(byId);
    afterGroup.sort(byId);

    //Сравниваем списки ДО и ПОСЛЕ
    Assert.assertEquals(beforeGroup, afterGroup);

  }

}
