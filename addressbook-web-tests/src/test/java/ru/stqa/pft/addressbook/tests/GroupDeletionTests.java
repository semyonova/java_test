package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends BaseTest {

    @Test
    public void TestsGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();

        if (! app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }

        List<GroupData> beforeGroup = app.getGroupHelper().getGroupList();

        //Удаляем группу по индексу
        app.getGroupHelper().deleteGroupByIndex(beforeGroup.size() - 1);
        app.getGroupHelper().returnToGroupPage();

        List<GroupData> afterGroup = app.getGroupHelper().getGroupList();

        //Проверяем количeство групп до и после выполнения теста
        Assert.assertEquals(beforeGroup.size() - 1, afterGroup.size());

        // Сравниваем списки групп до и после выполнения теста
        beforeGroup.remove(beforeGroup.size() - 1);
        Assert.assertEquals(beforeGroup, afterGroup);
    }
}
