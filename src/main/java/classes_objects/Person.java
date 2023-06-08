package classes_objects;

import javax.management.ConstructorParameters;

public class Person {
    private String name, surname;
    private double height;
    private int age;
    {
        name = "";
        surname = "";
        height = 0;
        age = 0;
    }
    public Person(){}
    public Person(String name, String surname, double height, int age){
        this.name =name;
        this.surname = surname;
        this.height = height;
        this.age = age;
    }
    public static void main(String... args){

    }
}
