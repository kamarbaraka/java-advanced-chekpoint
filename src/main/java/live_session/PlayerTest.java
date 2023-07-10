package live_session;

public class PlayerTest {

    public static void main(String[] args) {
        var player1 = new Player("kamar", "groupA", Skill.ARCHER);
        var player2 = new Player("tom", "groupB", Skill.MAGE);
        var player3 = new Player("makena", "groupC", Skill.WARRIOR);

        System.out.println(player1.getSkill());
        System.out.println(player2.getSkill());
        System.out.println(player3.getSkill());
    }
}
