package com.rd.person;

public class Women extends Person {
    private String originalSurname = getLastName();

    public Women(String firstName, String lastName, int age, String partner, boolean hasChild) {
        super(firstName, lastName, age, partner, hasChild);
    }

    @Override
    public boolean isRetired() {
        if (getAge() > 60) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean doesHaveManyChildren() {
        if(getChildrenCount() >= 3){
            return true;
        } else {
            return false;
        }
    }

    public void registerPartnership(String husbandSurname){
        this.setLastName(husbandSurname);
    }

    public void deregisterPartnership(boolean shouldBeDeregistered){
        if (shouldBeDeregistered == true) {
            this.setLastName(originalSurname);
        }
    }
}
