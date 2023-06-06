package conditions;

import java.util.Random;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void guessingAge(){
        var randomInt = new Random().nextInt(35);
        System.out.printf("i generated the random number %d for student %s\n", randomInt, this.name);
        var res = "equal";
        if (this.age - randomInt > 0) res = "lesser";
        if (this.age - randomInt < 0) res = "greater";
        System.out.printf("the random number is %s to the age", res);
        System.out.println();
    }

    public static void main (String... args){
        var kamar = new Student("kamar", 23);
        kamar.guessingAge();
    }
}
