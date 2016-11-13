package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;

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

        Groups beforeGroup = app.group().all();
        GroupData deletedGroup = beforeGroup.iterator().next();
        app.group().delete(deletedGroup);
        Groups afterGroup = app.group().all();

        //Проверяем количeство групп до и после выполнения теста
        assertEquals(beforeGroup.size() - 1, afterGroup.size());

        // Сравниваем списки групп до и после выполнения теста
        assertThat(afterGroup, equalTo(beforeGroup.without(deletedGroup)));
    }
}
