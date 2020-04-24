package edu.bsu.cs222;

public class AbilityScoreModifier {

    private int value = 0;
    private AbilityScoreId target;

    public AbilityScoreModifier(AbilityScoreId target) {
        this.target = target;
    }

    public void add(int value) {
        this.value += value;
    }

    public void sub(int i) {
        this.value -= value;
    }

    public int getValue() {
        return value;
    }
}
