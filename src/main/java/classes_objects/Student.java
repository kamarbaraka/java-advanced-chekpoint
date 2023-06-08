package classes_objects;

public class Student {
    private String name;
    private int grade;

    public Student(String name){
        this.name = name;
        System.out.println("student created!");
    }

    public void getStudentDetails(){
        System.out.printf("name= %s grade= %s \n", this.name, this.grade);
    }

    public void setGrade(int grade){
        this.grade = grade;
    }
}
