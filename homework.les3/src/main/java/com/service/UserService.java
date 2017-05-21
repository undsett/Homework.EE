package com.service;

import com.jmx.User;

public class UserService implements IUserService {

    private User originalUser = new User();
    private User cloneUser;




    public void createObjectFromBaseEntity() throws CloneNotSupportedException {
        cloneUser = (User) originalUser.clone();
    }

    public String getInformationAboutObject() {
        return cloneUser == null ? "Clone is absent" : cloneUser.toString();
    }
}
