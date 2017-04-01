package ru.stqa.pft.mantis.model;

import java.util.ArrayList;

public class Users {

  private String username;
  private String email;
  private ArrayList<Users> usersList = new ArrayList<>();


  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  public Users withUsername(String username){
    this.username = username;
    return this;
  }

  public Users withEmail(String email){
    this.email = email;
    return this;
  }

  public ArrayList<Users> addUser(Users user) {
    usersList.add(user);
    return usersList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Users users = (Users) o;

    if (username != null ? !username.equals(users.username) : users.username != null) return false;
    return email != null ? email.equals(users.email) : users.email == null;
  }

  @Override
  public String toString() {
    return "Users{" +
            "username='" + username + '\'' +
            ", email='" + email + '\'' +
            '}';
  }

  @Override
  public int hashCode() {
    int result = username != null ? username.hashCode() : 0;
    result = 31 * result + (email != null ? email.hashCode() : 0);
    return result;
  }
}
