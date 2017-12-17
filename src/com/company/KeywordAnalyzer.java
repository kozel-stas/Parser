package com.company;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeyword();
    protected abstract Label getLabel();
    @Override
    public Label processText(String text) {
        String[] a1=getKeyword();
        text.contains(a1[0]);
        boolean tochno=false;
        for (int i=0;i<a1.length;i++)
        {
            if (text.indexOf(a1[i])>-1)
                tochno=true;

        }
        if (tochno==true)
            return getLabel();
        else
        return Label.OK;
    }
}
