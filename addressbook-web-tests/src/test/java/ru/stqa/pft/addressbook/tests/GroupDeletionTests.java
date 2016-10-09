package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTests extends BaseTest {

    @Test
    public void TestsGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        int beforeGroup = app.getGroupHelper().getGroupCount();
        if (! app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().CreateGroup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupPage();
        int afterGroup = app.getGroupHelper().getGroupCount();
        //Проверяем количство групп до и после выполнения теста
        Assert.assertEquals(beforeGroup - 1, afterGroup);
    }
}
