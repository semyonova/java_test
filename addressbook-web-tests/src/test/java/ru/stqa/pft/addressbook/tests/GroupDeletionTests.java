package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends BaseTest {

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().groupPage();

        if (! app.group().isThereGroup()) {
            app.group().createGroup(new GroupData("test1", null, null));
        }
    }

    @Test
    public void TestsGroupDeletion() {

        List<GroupData> beforeGroup = app.group().list();
        int index = beforeGroup.size() - 1;

        //Удаляем группу по индексу
        app.group().deleteGroupByIndex(index);
        app.group().returnToGroupPage();

        List<GroupData> afterGroup = app.group().list();

        //Проверяем количeство групп до и после выполнения теста
        Assert.assertEquals(beforeGroup.size() - 1, afterGroup.size());

        // Сравниваем списки групп до и после выполнения теста
        beforeGroup.remove(index);
        Assert.assertEquals(beforeGroup, afterGroup);
    }
}
