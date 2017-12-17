package com.company;

public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;
    public TooLongTextAnalyzer(int len) {
     this.maxLength=len;
    }
    @Override
    public Label processText(String text) {
        if (text.length()>maxLength) return Label.TOO_LONG;
        else return Label.OK;
    }
}
