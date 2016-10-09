package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends BaseTest {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    int beforeGroup = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().CreateGroup(new GroupData("test1", null, null));
    int afterGroup = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(beforeGroup + 1, afterGroup);
  }

}
