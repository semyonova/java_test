package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.List;

// Универсальные методы для создания контактов
public class ContactHelper extends BaseHelper {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  // Редактирование контакта
  public void editContact() {
    click(By.xpath("//table[@id='maintable']/tbody//tr[4]/td[8]/a/img"));
  }

  // Присваивает передаваемому контакту старый индекс, метод в процессе реализации
  public void modifyContactByOldId(int idOfOldContact, ContactData contact){contact.withId(idOfOldContact);}

  // Клик по кнопке Enter на странице добавления Контакта
  public void submitContact() {
    click(By.name("submit"));
  }

  // Заполняет форму контактов
  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("middlename"), contactData.getMiddleName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("address"), contactData.getAddress());
    type(By.name("mobile"), contactData.getPhoneMobile());
    type(By.name("email"), contactData.getEmail());
    attach(By.name("photo"), contactData.getPhoto());

    //проверяем тип формы и в зависимости от типа заполняем поле
    //если для формы Модификации контакта вдруг поле найдено, то выводим ошибку
    if (creation) {
      if (contactData.getGroups().size() > 0) {
        Assert.assertTrue(contactData.getGroups().size() == 1);
        new Select(wd.findElement(By.name("new_group")))
                .selectByVisibleText(contactData.getGroups().iterator().next().getName());
     }
    } else {
        Assert.assertFalse(isElementPresent(By.name("new_group")));
      }
  }

  private void chooseContactById(int id) {
    wd.findElement(By.cssSelector("input[id ='" + id + "']")).click();
  }

  // Клик по кнопке Update на странице редактирования контакта
  public void submitContactModification() {
    click(By.name("update"));
  }

  public void deleteContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();
  }

  public void delete(ContactData deletedContact) {
    chooseContactById(deletedContact.getId());
    deleteContact();
  }

  public void createContact(ContactData contactData) {
    fillContactForm(contactData, true);
    submitContact();
    returnToHomePage();
  }

  public void modify(ContactData contact) {
    modifyContact(contact.getId());
    fillContactForm(contact, false);
    submitContactModification();
    returnToHomePage();
  }

  public void addContactToGroup(int contactId, int groupId) {
    chooseContactById(contactId);
    selectGroupForAddContact(groupId);
    clickAddTo();
  }

  public void deleteContactFromGroup(int contactId, int groupId) {
    selectGroup(groupId);
    chooseContactById(contactId);
    removeFromGroup();
  }

  private void removeFromGroup() {
    wd.findElement(By.name("remove")).click();
  }

  private void clickAddTo() {
    click(By.name("add"));
  }

  private void modifyContact(int id) {
    wd.findElement(By.xpath("//a[@href='edit.php?id=" + id + "']")).click();
  }

  private void selectGroupForAddContact(int id) {
    wd.findElement(By.name("to_group")).findElement(By.cssSelector("option[value ='" + id + "']")).click();
  }

  private void selectGroup(int id) {
    wd.findElement(By.name("group")).findElement(By.cssSelector("option[value ='" + id + "']")).click();
  }

  private void viewDetail(int id) {
    wd.findElement(By.xpath("//a[@href='view.php?id=" + id + "']")).click();
  }

  private boolean isThereContact() {
    return isElementPresent(By.name("selected[]"));
  }

  private int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }


  //Формирует множество конктактов с текущей (главной) страницы
  public Contacts all() {
    Contacts contacts = new Contacts();

    // Находим элементы на странице, заносим в список
    List<WebElement> elements = wd.findElements(By.xpath(".//tr[@name='entry']"));

    //Записываем веб-элементы в созданный ранее список(массив)
    for (WebElement element : elements) {
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("id"));
      String lastName = element.findElement(By.xpath(".//td[2]")).getText();
      String firstName = element.findElement(By.xpath(".//td[3]")).getText();
      String address = element.findElement(By.xpath(".//td[4]")).getText();
      String allEmails = element.findElement(By.xpath(".//td[5]")).getText();
      String allPhones = element.findElement(By.xpath(".//td[6]")).getText();
      contacts.add(new ContactData().
              withId(id).withFirstName(firstName).withLastName(lastName).
              withAllPhone(allPhones).withAllEmails(allEmails).withAddress(address));
    }
    return contacts;
  }

  //Считывает данные с формы редактирования контакта
  public ContactData infoFromEditForm(ContactData contact) {
    modifyContact(contact.getId());
    String firstname = wd.findElement(By.name("firstname")).getAttribute("value");
    String lastname = wd.findElement(By.name("lastname")).getAttribute("value");
    String home = wd.findElement(By.name("home")).getAttribute("value");
    String mobile = wd.findElement(By.name("mobile")).getAttribute("value");
    String work = wd.findElement(By.name("work")).getAttribute("value");
    String email = wd.findElement(By.name("email")).getAttribute("value");
    String email2 = wd.findElement(By.name("email2")).getAttribute("value");
    String email3 = wd.findElement(By.name("email3")).getAttribute("value");
    String address = wd.findElement(By.xpath(".//textarea[@name='address']")).getText();
    wd.navigate().back();
    return new ContactData().
            withId(contact.getId()).withFirstName(firstname).withLastName(lastname)
            .withPhoneHome(home).withPhoneMobile(mobile).withPhoneWork(work)
            .withEmail(email).withEmail2(email2).withEmail3(email3)
            .withAddress(address);
  }

  //Считывает данные с детальной страницы контакта
  public ContactData infoFromDetails(ContactData contact) {
    viewDetail(contact.getId());
    String element = wd.findElement(By.xpath(".//div[@id='content']")).getText();
    wd.navigate().back();
    return new ContactData().withDetailInfo(element);
  }
}

