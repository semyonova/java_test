package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends BaseTest {

    @Test
    public void TestsGroupDeletion() {
        gotoGroupPage();
        selectGroup();
        deleteGroup();
        returnToGroupPage();
    }
}
