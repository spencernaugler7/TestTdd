package edu.bsu.cs222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Handbook5e {
    private Race constructRace(String raceName, int strEffect) {
        return new Race.Builder().withName(raceName).andStatEffect(AbilityScoreId.STR, strEffect).build();
    }

    private final List<Race> races = Arrays.asList (
        constructRace("Half-Orc", 2),
        constructRace("DragonBorn", 2),
        constructRace("Dwarf", 0),
        constructRace("Elf", 2),
        constructRace("Gnome", 2),
        constructRace("Half-Elf", 0),
        constructRace("Halfling", 0),
        constructRace("Human", 0),
        constructRace("Tiefling", 0)
    );

    public List<Race> getRaces() {
        return new ArrayList<>(races);
    }
}
