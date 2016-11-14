package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class ContactPhonesTests extends BaseTest {

  @Test
  public void testContactPhones() {
    app.goTo().HomePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

    //Сравниваем телефон с главной страницы с телефоном на странице редактирования
    assertThat(contact.getPhoneHome(), equalTo(contactInfoFromEditForm.getPhoneHome()));
    assertThat(contact.getPhoneMobile(), equalTo(contactInfoFromEditForm.getPhoneMobile()));
    assertThat(contact.getPhoneWork(), equalTo(contactInfoFromEditForm.getPhoneWork()));
  }
}
