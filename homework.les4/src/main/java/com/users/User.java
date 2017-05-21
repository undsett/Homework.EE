package com.users;

import org.dozer.Mapping;

public class User {
  @Mapping("login")
  String name;
  int age;
  Company company;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
    this.company = new Company("yyy");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", company=" + company +
        '}';
  }
}
