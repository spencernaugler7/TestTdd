package edu.bsu.cs222;

import java.util.List;

public class Race {
    private final String name;
    private List<AbilityScoreModifier> abilityScoreEffects;
    private RacialPerk racialPerk;

    public List<RacialPerk> getAvalibleRacialPerks() {
        return null;
    }

    public List<AbilityScoreModifier> getModifiers() {
        return abilityScoreEffects;
    }

    private Race(Builder builder) {
        this.abilityScoreEffects = builder.abilityScoreModifiers;
        this.name = builder.raceName;
    }

    public static class Builder {
        private List<AbilityScoreModifier> abilityScoreModifiers;
        private String raceName;

        public Builder withName(String raceName) {
            this.raceName = raceName;
            return this;
        }

        public Builder andStatEffect(AbilityScoreModifier abilityScoreModifier) {
            abilityScoreModifiers.add(abilityScoreModifier);
            return this;
        }

        public Race build() {
            return new Race(this);
        }
    }
}
