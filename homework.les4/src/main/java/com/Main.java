package com;

import com.mapper.CustomMaper;
import com.users.Person;
import com.users.User;

public class Main {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    User user = new User("xxx", 12);
    Person person = new Person();
    CustomMaper.map(user, person);
    System.out.printf(
        "originalUser: %s, cloneUser %s",
        user, person);
  }

}
