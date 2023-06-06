package conditions;

public class Person {
    private int age;
    public Person(){
        this.age = (int) Math.floor(Math.random() * (80 - 5 + 1) + 5);
    }
    public String getLifeStage(){
        if (this.age < 13) return "Child";
        if (this.age < 20) return "Teen";
        if (this.age < 60) return "Adult";
        return "Senior Adult";
    }
    public static void main(String... args){
        var kamar = new Person();
        System.out.printf("The person is in the %s stage of life", kamar.getLifeStage());
    }
}
