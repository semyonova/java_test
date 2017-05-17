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

    System.out.println(getSite("se.g@ya.ru"));

    //Сравниваем данные контакта на странице редактирования с данными в карточке
    assertThat(contactInfoFromDetails.getDetailInfo(), equalTo(mergeAll(contactInfoFromEditForm)));
  }

  //Соединяем поля с детальной страницы в один блок
  public String mergeAll(ContactData contact){
    return Arrays.asList(contact.getFirstName(), " ", contact.getLastName(), "\\n", contact.getAddress(), "\\n",
            "\\nH: ", contact.getPhoneHome(), "\\nM: ", contact.getPhoneMobile(), "\\nW: ", contact.getPhoneWork(), "\\n",
            "\\n", contact.getEmail(), getSite(contact.getEmail()),
            ")\\n", contact.getEmail2(), getSite(contact.getEmail2()),
            ")\\n", contact.getEmail3(), getSite(contact.getEmail3()), ")")
            .stream().filter((s) -> ! s.equals(""))
            .collect(Collectors.joining(""));
  }

  public static String getSite(String email){
    return email.replaceAll("([A-za-zа-яА-я0-9\\.]*)@"," (www.");
  }

}
