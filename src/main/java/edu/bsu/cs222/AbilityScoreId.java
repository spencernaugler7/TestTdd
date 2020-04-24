package edu.bsu.cs222;


public enum AbilityScoreId {

    STR("Strength", AbilityScoreModifierId.STR_MOD, "STR"),
    DEX("Dexterity", AbilityScoreModifierId.DEX_MOD, "DEX"),
    CON("Constitution", AbilityScoreModifierId.CON_MOD, "CON"),
    INT("Intelligence", AbilityScoreModifierId.INT_MOD, "INT"),
    WIS("Wisdom", AbilityScoreModifierId.WIS_MOD, "WIS"),
    CHA("Charisma", AbilityScoreModifierId.CHA_MOD, "DEX");


    public final String name;
    private final AbilityScoreModifierId modifier;
    private final String pdfFormFieldName;

    AbilityScoreId(String name, AbilityScoreModifierId modifier, String pdfFormFieldName) {
        this.name = name;
        this.modifier = modifier;
        this.pdfFormFieldName = pdfFormFieldName;
    }
}
