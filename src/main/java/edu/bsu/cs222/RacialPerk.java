package edu.bsu.cs222;

import java.util.List;

public interface RacialPerk {
    String getPerkName();
    List<AbilityScoreModifier> getRacialPerkAbilityScoreEffects();
}
