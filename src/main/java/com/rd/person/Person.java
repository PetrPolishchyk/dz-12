package com.rd.person;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String partner;
    private boolean hasChild;
    private int childrenCount;

    //constructor
    public Person(String firstName, String lastName, int age, String partner, boolean hasChild) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
        this.hasChild = hasChild;
    }

    //abstract methods
    public abstract boolean isRetired();
    public abstract boolean doesHaveManyChildren();

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPartner() {
        return partner;
    }

    public boolean isHasChild() {
        return hasChild;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }
}
