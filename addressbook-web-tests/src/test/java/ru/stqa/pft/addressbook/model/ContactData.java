package ru.stqa.pft.addressbook.model;

public class ContactData {
  private String firstName;
  private String middleName;
  private String lastName;
  private String address;
  private String mobile;
  private String email;
  private String group;

  public ContactData(String firstName, String middleName, String lastName, String address, String mobile, String email, String group) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.address = address;
    this.mobile = mobile;
    this.email = email;
    this.group = group;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }

  public String getGroup() {
    return group;
  }
}
