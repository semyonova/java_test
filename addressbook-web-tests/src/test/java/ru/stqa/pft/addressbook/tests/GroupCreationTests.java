package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;


public class GroupCreationTests extends BaseTest {

  @Test
  public void testGroupCreation() {
    app.goTo().groupPage();

    //Формируем список(массив) из элементов групп До теста
    Set<GroupData> beforeGroup = app.group().all();

    GroupData group = new GroupData().withName("test");
    app.group().createGroup(group);

    //Формируем список(массив) из элементов групп ПОСЛЕ теста
    Set<GroupData> afterGroup = app.group().all();

    //Проверяем количество групп до и после выполнения теста
    Assert.assertEquals(beforeGroup.size() + 1, afterGroup.size());

    //Добавляем элемент в список(массив) ДО
    beforeGroup.add(group.withId(afterGroup.stream().mapToInt((g) -> g.getId()).max().getAsInt()));

    //Сравниваем множества ДО и ПОСЛЕ
    Assert.assertEquals(beforeGroup, afterGroup);

    //Находим максимальное id в списке ПОСЛЕ
    //Превращаем список в поток, сравниваем элементы и находим максимальный, получаем этот элемент, получаем его id
    //int max = afterGroup.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId();
    //Присваиваем элементу максимальный id
    //group.setId(max);
  }

}
