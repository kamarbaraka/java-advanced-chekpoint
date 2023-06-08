package classes_objects;

public class Teacher {
    private String teacherName;
    private int finalGrade;

    public Teacher(String teacherName){
        this.teacherName = teacherName;
        System.out.println("Teacher has been created!");
    }

    public void assignGrade(Student student, int finalGrade){
        student.setGrade(finalGrade);
    }

    public static void main(String... args){
        var studKamar = new Student("kamar");
        var studBaraka = new Student("baraka");

        var teach = new Teacher("Mode");

        teach.assignGrade(studKamar, 25);
        teach.assignGrade(studBaraka, 75);

        studKamar.getStudentDetails();
        studBaraka.getStudentDetails();
    }
}
