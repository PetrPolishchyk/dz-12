package com.rd.person;

public class Main {
    public static void main(String[] args) {
        System.out.println("begin");
        //create men objects
        Men manFirst = new Men("Peter", "Polishchuk", 35, "Valentina Polishchuk", true);
        Men manSecond = new Men("Oleg", "Zubarskiy", 68, "Olena Dushchak", false);

        //create women objects
        Women womenFirst = new Women("Valentina", "Drobina", 39, "Peter Polishchuk", true);
        Women womenSecond = new Women("Anna", "Biligorova", 62, "Sergiy Paraysov", true);

        //add children
        manFirst.setChildrenCount(1);
        manSecond.setChildrenCount(0);
        womenFirst.setChildrenCount(1);
        womenSecond.setChildrenCount(5);

        //check retired
        System.out.println("Is " + manFirst.getFirstName() + " retired? - " + manFirst.isRetired());
        System.out.println("Is " + manSecond.getFirstName() + " retired? - " + manSecond.isRetired());
        System.out.println("Is " + womenFirst.getFirstName() + " retired? - " + womenFirst.isRetired());
        System.out.println("Is " + womenSecond.getFirstName() + " retired? - " + womenSecond.isRetired());

        //do they have many children
        System.out.println("Does " + manFirst.getFirstName() + " have many children? - " + manFirst.doesHaveManyChildren());
        System.out.println("Does " + manSecond.getFirstName() + " have many children? - " + manSecond.doesHaveManyChildren());
        System.out.println("Does " + womenFirst.getFirstName() + " have many children? - " + womenFirst.doesHaveManyChildren());
        System.out.println("Does " + womenSecond.getFirstName() + " have many children? - " + womenSecond.doesHaveManyChildren());

        //women registerPartnership
        womenFirst.registerPartnership("Polishchuk");
        womenSecond.registerPartnership("Zubarsky");
        //check registering
        System.out.println(womenFirst.getLastName());
        System.out.println(womenSecond.getLastName());

        //deregister partnership
        womenSecond.deregisterPartnership(true);
        //check deregister
        System.out.println(womenSecond.getLastName());

    }
}

