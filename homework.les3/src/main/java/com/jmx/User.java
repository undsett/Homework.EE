package com.jmx;

public class User implements Cloneable{
    private String Name;
    private int age;

    public User() {
        this.Name = "Name";
        this.age = 75;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
