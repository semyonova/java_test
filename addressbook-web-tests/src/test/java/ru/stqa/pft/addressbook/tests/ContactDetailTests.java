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
    System.out.println(mergeAll(contactInfoFromEditForm));
    ContactData contactInfoFromDetails = app.contact().infoFromDetails(contact);
    System.out.println(contactInfoFromDetails.getDetailInfo());

    //Сравниваем данные контакта на странице редактирования с данными в карточке
    assertThat(contactInfoFromDetails.getDetailInfo(), equalTo(mergeAll(contactInfoFromEditForm)));
  }

  //Соединяем поля с детальной страницы в один блок
  public String mergeAll(ContactData contact){
    return Arrays.asList(
            getNameWith(contact.getFirstName()), " ", getNameWith(contact.getLastName()),
            getAddressWith(contact.getAddress()),
            "\\n",
            getPhoneHomeWith(contact.getPhoneHome()),
            getPhoneMobileWith(contact.getPhoneMobile()),
            getPhoneWorkWith(contact.getPhoneWork()),
            "\\n",
            getEmailWith(contact.getEmail()), getSite(contact.getEmail()),
            getEmailWith(contact.getEmail2()), getSite(contact.getEmail2()),
            getEmailWith(contact.getEmail3()), getSite(contact.getEmail3()))
            .stream().filter((s) -> ! s.equals(""))
            .collect(Collectors.joining(""));
  }

  public static String getNameWith(String name){
    if ("".equals(name))
      return "";
    else
      return name;
  }

  public static String getAddressWith(String address){
    if ("".equals(address))
      return "";
    else
      return "\\n" + address;
  }

  public static String getPhoneHomeWith(String phone){
    if ("".equals(phone))
      return "";
    else
      return "\\nH: " + phone;
  }

  public static String getPhoneMobileWith(String phone){
    if ("".equals(phone))
      return "";
    else
      return "\\nM: " + phone;
  }

  public static String getPhoneWorkWith(String phone){
    if ("".equals(phone))
      return "";
    else
      return "\\nW: " + phone;
  }

  public static String getEmailWith(String email){
    if ("".equals(email))
      return "";
    else
      return "\\n" + email;
  }

  public static String getSite(String email){
    if ("".equals(email))
      return "";
    else
    return email.replaceAll("([A-za-zа-яА-я0-9\\.]*)@"," (www.") + ")";
  }

}
