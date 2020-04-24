package edu.bsu.cs222;

import java.util.ArrayList;
import java.util.List;

public class AbilityScore {
    private final AbilityScoreId id;
    private final int abilityScoreValue;
    private List<AbilityScoreModifier> abilityScoreModifierList = new ArrayList<>();

    public AbilityScore(AbilityScoreId id  , int AbilityScoreValue) {
        this.id = id;
        this.abilityScoreValue = AbilityScoreValue;
    }

    public AbilityScoreId getId() {
        return id;
    }

    public void addModifier(AbilityScoreModifier abilityScoreModifier) {
        abilityScoreModifierList.add(abilityScoreModifier);
    }

    public int getValue() {
        int addedModifiers = calcModifierTotal();
        return abilityScoreValue + addedModifiers;
    }

    public int getDndModifier() {
        return modifierCalculation(getValue());
    }

    private int modifierCalculation(int abilityScoreValue) {
        return (int) Math.floor(((float) abilityScoreValue - 10) / 2);
    }

    private int calcModifierTotal() {
        int total = 0;
        for (AbilityScoreModifier abilityScoreModifier : abilityScoreModifierList) {
            total += abilityScoreModifier.getValue();
        }
        return total;
    }
}
