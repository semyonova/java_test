package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends BaseTest {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    int beforeGroup = app.getGroupHelper().getGroupCount();
    if (! app.getGroupHelper().isThereGroup()) {
      app.getGroupHelper().CreateGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup(beforeGroup - 1);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("1", "test1", "test2"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    int afterGroup = app.getGroupHelper().getGroupCount();
    //Проверяем количeство групп до и после выполнения теста
    Assert.assertEquals(beforeGroup, afterGroup);
  }

}
