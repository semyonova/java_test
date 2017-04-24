package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class ContactDetailTests extends BaseTest {

  @Test
  public void testDetailContact() {
    app.goTo().HomePage();

    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);
    ContactData contactInfoFromDetails = app.contact().infoFromDetails(contact);

    //Сравниваем данные контакта на странице редактирования с данными в карточке
    assertThat(contactInfoFromDetails.getDetailInfo(), equalTo(mergeAll(contactInfoFromEditForm)));
  }

  public static String pureCleaned (String phone){
    return phone.replaceAll("\\s","");
  }

  public String mergeAll(ContactData contact){
    return Arrays.asList(contact.getFirstName(), contact.getLastName(), contact.getAddress(),
            contact.getPhoneHome(), contact.getPhoneMobile(), contact.getPhoneWork())
            .stream().filter((s) -> ! s.equals(""))
            .map(ContactDetailTests::pureCleaned)
            .collect(Collectors.joining(""));
  }
}
