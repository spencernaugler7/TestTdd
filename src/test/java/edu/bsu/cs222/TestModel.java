package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestModel {
    Character player;
    /*
        todo: figure out specs
        given a character with 10 strength and 10 constitution, Race with a +1 strength affector,
            - and a subrace with a +1  strength
        when I construct the character, I get a strength mod of 1
        given a character the same as above,
            when I make a race with a strength modifier of -1 and no racial perk, and I change the character's race to the new race,
            I get strength of 9
    */

    @BeforeEach
    public void setupPlayer() {

    }

    @Test
    public void testStrengthIs12() {
        Assertions.assertEquals(12, player.getAbilityScoreValue(AbilityScoreId.STR));
    }

    @Test
    public void testStrengthModifierIs1() {
        Assertions.assertEquals(1, player.getModifierValue(AbilityScoreId.STR));
    }

    @Test
    public void testRaceChange() {
        Race newRace = new Race.Builder().andStatEffect(AbilityScoreId.STR, -1).build();
        player.setRace(newRace);
        Assertions.assertEquals(9, player.getAbilityScoreValue(AbilityScoreId.STR));
    }
}
