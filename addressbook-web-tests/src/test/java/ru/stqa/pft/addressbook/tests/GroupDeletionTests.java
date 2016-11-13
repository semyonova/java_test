package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

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

        //Проверяем количeство групп до и после выполнения теста
        assertThat(app.group().count(),equalTo(beforeGroup.size() - 1));

        Groups afterGroup = app.group().all();

        // Сравниваем списки групп до и после выполнения теста
        assertThat(afterGroup, equalTo(beforeGroup.without(deletedGroup)));
    }
}
