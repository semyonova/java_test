package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupCreationTests extends BaseTest {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> beforeGroup = app.getGroupHelper().getGroupList();
    app.getGroupHelper().CreateGroup(new GroupData("test1", null, null));
    List<GroupData> afterGroup = app.getGroupHelper().getGroupList();
    //Проверяем количство групп до и после выполнения теста
    Assert.assertEquals(beforeGroup.size() + 1, afterGroup.size());
  }

}
