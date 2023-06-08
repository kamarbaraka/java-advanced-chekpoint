package classes_objects;

public class CompetitionRules {
    private static CompetitionRules competitionRulesInstance = null;
    private String competitionRule1, competitionRule2, competitionRule3;

    private CompetitionRules(){
        this.competitionRule1 = "do not copy and paste from stack overflow";
        this.competitionRule2 = "learn every day";
        this.competitionRule3 = "be the best team";
    }

    public static CompetitionRules getInstance(){
        if (competitionRulesInstance == null)
            competitionRulesInstance = new CompetitionRules();
        return competitionRulesInstance;
    }

    public void printRules(){
        System.out.printf("%s \n%s \n%s \n",
                this.competitionRule1, this.competitionRule2, this.competitionRule3);
    }
}
