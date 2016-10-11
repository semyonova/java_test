package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends BaseTest {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();

    if (! app.getGroupHelper().isThereGroup()) {
      app.getGroupHelper().CreateGroup(new GroupData("test1", null, null));
    }

    List<GroupData> beforeGroup = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(beforeGroup.size() - 1);
    app.getGroupHelper().initGroupModification();
    GroupData group = new GroupData("1", "test1", "test2", beforeGroup.get(beforeGroup.size() - 1).getId());
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> afterGroup = app.getGroupHelper().getGroupList();

    //Удаляем объект, который редактировали и добавляем тот же объект с отредактированными данными (id сохраняем)
    beforeGroup.remove(beforeGroup.size() - 1);
    beforeGroup.add(group);

    //Преобразуем список в множество
    // Проверяем элементы множества до и после выполнения теста
    Assert.assertEquals(new HashSet<>(beforeGroup), new HashSet<>(afterGroup));

  }

}
