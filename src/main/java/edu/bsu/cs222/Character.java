package edu.bsu.cs222;

import java.util.ArrayList;
import java.util.List;

public class Character {

    private Race race;
    private List<AbilityScore> abilityScoresList = new ArrayList<>();

    public int getAbilityScoreValue(AbilityScoreId targetId) {
        for(AbilityScore current : abilityScoresList) {
            if(current.getId().equals(targetId)) {
                return current.getValue();
            }
        }
        throw new NullPointerException();
    }

    public void addAbilityScore(AbilityScore abilityScore) {
        if()
    }

    public void setRace(Race race) {
        this.race = race;
        List<AbilityScoreModifier> modifiers = race.getModifiers();
        for(AbilityScoreModifier current : modifiers) {
            abilityScoresList.get(current.get)
        }
    }
}
