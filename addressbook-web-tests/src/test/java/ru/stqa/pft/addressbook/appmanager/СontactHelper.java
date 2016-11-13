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
public class СontactHelper extends BaseHelper {

  public СontactHelper(WebDriver wd) {
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
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("email"), contactData.getEmail());

    //проверяем тип формы и в зависимости от типа заполняем поле
    //если для формы Модификации контакта вдруг поле найдено, то выводим ошибку
    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void chooseContactById(int id) {
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

  private void modifyContact(int id) {
    wd.findElement(By.xpath("//a[@href='edit.php?id=" + id + "']")).click();
  }

  public boolean isThereContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  //Формирует множество конктактов с текущей страницы
  public Contacts all() {
    Contacts contacts = new Contacts();

    // Находим элементы на странице, заносим в список
    List<WebElement> elements = wd.findElements(By.xpath(".//tr[@name='entry']"));

    //Записываем веб-элементы в созданный ранее список(массив)
    for (WebElement element : elements) {
      String lastName = element.findElement(By.xpath(".//td[2]")).getText();
      System.out.println(lastName);
      String firstName = element.findElement(By.xpath(".//td[3]")).getText();
      System.out.println(firstName);
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("id"));
      System.out.println(id);
      contacts.add(new ContactData().withId(id).withFirstName(firstName).withLastName(lastName));
    }
    return contacts;
  }
}

