package com.company;

import com.sun.org.apache.xpath.internal.compiler.Keywords;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keyword;
    public SpamAnalyzer(String[] Keyword) {
        this.keyword=Keyword;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    protected String[] getKeyword() {
        return keyword;
    }
}
