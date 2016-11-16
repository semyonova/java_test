package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class ContactInformTests extends BaseTest {

  @Test
  public void testContactPhones() {
    app.goTo().HomePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

    //Сравниваем данные контакта с главной страницы с данными на странице редактирования
    assertThat(contact.getAllPhone(), equalTo(mergePhones(contactInfoFromEditForm)));
    assertThat(contact.getAllEmails(), equalTo(mergeEmails(contactInfoFromEditForm)));
    assertThat(cleanedAddressMain(contact.getAddress()), equalTo(cleanedAddress(contactInfoFromEditForm.getAddress())));
  }

  public static String cleaned (String phone){
    return phone.replaceAll("\\s","").replaceAll("[-()]","");
  }

  //Удаляет лишние пробелы (более одного) в поле Адреса на форме редактирования
  public static String cleanedAddress (String phone){
    return phone.replaceAll("\\s+"," ");
  }

  //Удаляет символ новой строки при считывании адреса с главной страницы
  public static String cleanedAddressMain(String phone){
    return phone.replaceAll("\\n"," ");
  }


  public String mergePhones(ContactData contact){
    return Arrays.asList(contact.getPhoneHome(), contact.getPhoneMobile(), contact.getPhoneWork())
            .stream().filter((s) -> ! s.equals(""))
            .map(ContactInformTests::cleaned)
            .collect(Collectors.joining("\n"));
  }

  public String mergeEmails (ContactData contact){
    return Arrays.asList(contact.getEmail(), contact.getEmail2(), contact.getEmail3())
            .stream().filter((s) -> ! s.equals(""))
            .collect(Collectors.joining("\n"));
  }

}
