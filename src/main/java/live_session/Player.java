package live_session;

public class Player {

    private String name, team;
    private Skill skill;

    public Player(String name, String team, Skill skill) {
        this.name = name;
        this.team = team;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}

enum Skill{ARCHER("archer"), WARRIOR("warrior"), MAGE("mage");

    Skill(String skill) {
    }
}
