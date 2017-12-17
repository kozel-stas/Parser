package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.err.println(lol(4));
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 40;
        TextAnalyzer[] textAnalyzers1 = {
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        // тестовые комментарии
        try {

        }
        catch (Exception lol)
        {
            throw lol;
        }
        String[] tests = new String[8];
        tests[0] = "This comment is so good.";                            // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
        tests[4] = "This comment is so bad....";                          // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
        for (int i=0;i<3;i++)
        {
           System.out.println( textAnalyzers1[i].processText(tests[0]));
        }
        System.out.println(sqrt(4.7));

    }
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i=0;i<analyzers.length;i++)
        {
            if (analyzers[i].processText(text)!=Label.OK)
                return analyzers[i].processText(text);
        }
        return Label.OK;
    }
    public static double sqrt(double x) {
        getCallerClassAndMethodName();
        if (x<0) {
             throw new java.lang.IllegalArgumentException ("Expected non-negative number, got "+x);
        }
    else return Math.sqrt(x);
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ste = new Exception().getStackTrace();
        if (ste.length<3)
        return null;
        else return ste[2].getClassName()+'#'+ste[2].getMethodName();
    }
    public static int lol (int a) {
        if (a==1) return 1;
        else {
            return a*lol(a--);
        }
    }
}
