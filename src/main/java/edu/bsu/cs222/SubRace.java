package edu.bsu.cs222;

import java.util.ArrayList;
import java.util.List;

public class SubRace implements RacialPerk {
    private final String name;
    public List<AbilityScoreModifier> abilityScoreEffects;

    @Override
    public String getPerkName() {
        return name;
    }

    @Override
    public List<AbilityScoreModifier> getRacialPerkAbilityScoreEffects() {
        return abilityScoreEffects;
    }

    public List<AbilityScoreModifier> getRacialAbilityScoreEffects() {
        return abilityScoreEffects;
    }

    public SubRace(Builder builder) {
        this.name = builder.subRaceName;
        this.abilityScoreEffects = builder.initialAbilityScoreEffects;
    }

    public static class Builder {
        private List<AbilityScoreModifier> initialAbilityScoreEffects = new ArrayList<>();
        private String subRaceName;

        public Builder withSubRaceName(String name) {
            this.subRaceName = name;
            return this;
        }

        public Builder addModifier(AbilityScoreId abilityScoreId, int value) {
            AbilityScoreModifier abilityScoreModifier = new AbilityScoreModifier(abilityScoreId);
            abilityScoreModifier.add(value);
            this.initialAbilityScoreEffects.add(abilityScoreModifier);
            return this;
        }

        public SubRace build() {
            return new SubRace(this);
        }
    }
}
