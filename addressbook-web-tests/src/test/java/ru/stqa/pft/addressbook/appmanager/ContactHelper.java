package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
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
    click(By.xpath("//table[@id='maintable']/tbody//td[8]/a/img"));
  }

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

  public void chooseContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  // Клик по кнопке Update на странице редактирования контакта
  public void submitContactModification() {
    click(By.name("update"));
  }

  public void deleteContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();
  }

  public void CreateContact(ContactData contactData, boolean creation) {
    fillContactForm(contactData, creation);
    submitContact();
    returnToHomePage();
  }

  public boolean isThereContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<>();
    List<WebElement> elements = wd.findElements(By.name("entry"));
    System.out.print(wd.findElement(By.name("entry")));
    for (WebElement element : elements) {
      String lastName = element.getText();
      String firstName = element.getText();
      System.out.println(element.getText());
      ContactData contact = new ContactData(firstName, null, lastName, null, null, null, null);
      contacts.add(contact);
    }
    return contacts;
  }
}

