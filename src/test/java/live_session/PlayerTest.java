package live_session;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void playerTest(){

        Player player = new Player("makena", "teamA", Skill.ARCHER);
        Assertions.assertEquals(Skill.ARCHER, player.getSkill());
    }

}