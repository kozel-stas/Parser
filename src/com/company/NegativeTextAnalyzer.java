package com.company;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keyword= new String[3];
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeyword() {
        keyword[0]=":(";
        keyword[1]="=(";
        keyword[2]=":|";
        return keyword;
    }
}
