package edu.bsu.cs222;

public enum AbilityScoreModifierId {

    STR_MOD("STRmod", AbilityScoreId.STR),
    DEX_MOD("DEXmod ", AbilityScoreId.DEX),
    CON_MOD("CONmod", AbilityScoreId.CON),
    INT_MOD("INTmod", AbilityScoreId.INT),
    WIS_MOD("WISmod", AbilityScoreId.WIS),
    CHA_MOD("CHamod", AbilityScoreId.CHA);

    public String pdfFormFieldName;
    public AbilityScoreId mainAbilityScoreId;

    AbilityScoreModifierId(String pdfFormFieldName, AbilityScoreId mainAbilityScoreId) {
        this.pdfFormFieldName = pdfFormFieldName;
        this.mainAbilityScoreId = mainAbilityScoreId;
    }


}
