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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
    if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
    return email != null ? email.equals(that.email) : that.email == null;

  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    return result;
  }
}
