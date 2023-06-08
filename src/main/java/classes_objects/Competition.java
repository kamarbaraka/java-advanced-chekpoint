package classes_objects;

public class Competition {
    public static void main(String... args){
        var rules = CompetitionRules.getInstance();
        rules.printRules();

        var kamar = new Programmer("kamar", "java", 1);
        var baraka = new Programmer("baraka", "python", 2);

        var teamA = new Team("teamA", kamar, baraka);
        var teamB = new Team("teamB", baraka, kamar);

        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }
}
