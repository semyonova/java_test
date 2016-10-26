package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;


public class GroupCreationTests extends BaseTest {

  @Test
  public void testGroupCreation() {
    app.goTo().groupPage();

    //Формируем список(массив) из элементов групп До теста
    List<GroupData> beforeGroup = app.group().list();

    GroupData group = new GroupData("test", null, null);
    app.group().createGroup(group);

    //Формируем список(массив) из элементов групп ПОСЛЕ теста
    List<GroupData> afterGroup = app.group().list();

    //Проверяем количество групп до и после выполнения теста
    Assert.assertEquals(beforeGroup.size() + 1, afterGroup.size());

    //Добавляем элемент в список(массив) ДО
    beforeGroup.add(group);

    //Упорядочиваем списки по id перед сравнением
    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    beforeGroup.sort(byId);
    afterGroup.sort(byId);

    //Сравниваем списки ДО и ПОСЛЕ
    Assert.assertEquals(beforeGroup, afterGroup);

    //Находим максимальное id в списке ПОСЛЕ
    //Превращаем список в поток, сравниваем элементы и находим максимальный, получаем этот элемент, получаем его id
    //int max = afterGroup.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId();
    //Присваиваем элементу максимальный id
    //group.setId(max);
  }

}
