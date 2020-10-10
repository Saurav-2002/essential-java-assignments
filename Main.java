package com.company;

public class Main {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name="Saurav Sanap";
        e.age=18;
        e.city="nashik";

        Employee e1 = new Employee();
        e1.name="Narendra Modi";
        e1.age=70;
        e1.city="delhi";

        e.display();
        e1.display();
    }
}
