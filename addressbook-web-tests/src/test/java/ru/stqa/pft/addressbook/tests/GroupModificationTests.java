package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

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
    app.getGroupHelper().fillGroupForm(new GroupData("1", "test1", "test2"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> afterGroup = app.getGroupHelper().getGroupList();

    //Проверяем количeство групп до и после выполнения теста
    Assert.assertEquals(beforeGroup.size(), afterGroup.size());
  }

}
