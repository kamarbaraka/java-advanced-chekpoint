package classes_objects;

public class Team {
    private String teamName;
    private Programmer p1, p2;

    public Team(String teamName, Programmer p1, Programmer p2){
        this.teamName = teamName;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void printTeamDetails(){
        System.out.printf("%s \n%s \n%s", this.teamName, this.p1, this.p2);
    }
}
