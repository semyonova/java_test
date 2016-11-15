package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class ContactPhonesTests extends BaseTest {

  @Test
  public void testContactPhones() {
    app.goTo().HomePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

    //Сравниваем телефон с главной страницы с телефоном на странице редактирования
    assertThat(contact.getAllPhone(), equalTo(merge(contactInfoFromEditForm)));
  }

  public static String cleaned (String phone){
    return phone.replaceAll("\\s","").replaceAll("[-()]","");
  }

  public String merge (ContactData contact){
    return Arrays.asList(contact.getPhoneHome(), contact.getPhoneMobile(), contact.getPhoneWork())
            .stream().filter((s) -> ! s.equals(""))
            .map(ContactPhonesTests::cleaned)
            .collect(Collectors.joining("\n"));
  }

}
