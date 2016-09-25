package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends BaseTest {

    @Test
    public void TestsGroupDeletion() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteGroup();
        app.returnToGroupPage();
    }
}
