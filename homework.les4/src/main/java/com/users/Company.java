package com.users;

public class Company {

  String name;

  public Company(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Company{" +
        "name='" + name + '\'' +
        '}';
  }
}
