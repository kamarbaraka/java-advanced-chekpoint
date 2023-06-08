package classes_objects;

public class Programmer {
    private String name, programmingLanguage;
    private int yearsOfExperience;

    public Programmer(String name, String programmingLanguage, int yearsOfExperience){
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void printProgrammerDetails(){
        var details = "name= %s, programmingLanguage= %s, yearsOfExperience= %s".formatted(
                this.name, this.programmingLanguage, this.yearsOfExperience
        );
        System.out.println(details);
    }
}
