package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAbilityScoreMath {

    @Test
    public void testStrIs12() {
        AbilityScore abilityScore = new AbilityScore(AbilityScoreId.STR, 10);
        AbilityScoreModifier abilityScoreModifier = new AbilityScoreModifier(AbilityScoreId.STR);
        abilityScoreModifier.add(1);
        abilityScore.addModifier(abilityScoreModifier);
        abilityScore.addModifier(abilityScoreModifier);
        Assertions.assertEquals(12, abilityScore.getValue());
    }
}
