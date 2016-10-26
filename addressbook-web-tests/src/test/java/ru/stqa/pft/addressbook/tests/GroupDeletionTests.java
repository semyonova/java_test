package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

public class GroupDeletionTests extends BaseTest {

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().groupPage();

        if (app.group().all().size() == 0) {
            app.group().createGroup(new GroupData().withName("test1"));
        }
    }

    @Test
    public void TestsGroupDeletion() {

        Set<GroupData> beforeGroup = app.group().all();
        GroupData deletedGroup = beforeGroup.iterator().next();
        app.group().delete(deletedGroup);
        Set<GroupData> afterGroup = app.group().all();

        //Проверяем количeство групп до и после выполнения теста
        Assert.assertEquals(beforeGroup.size() - 1, afterGroup.size());

        // Сравниваем списки групп до и после выполнения теста
        beforeGroup.remove(deletedGroup);
        Assert.assertEquals(beforeGroup, afterGroup);
    }
}
