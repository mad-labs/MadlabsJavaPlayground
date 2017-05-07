
package it.madlabs.playground.extractionexamples;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class SymbolReplacer1 {
    protected String stringToReplace;
    protected List<String> alreadyReplaced = new ArrayList<String>();

    public SymbolReplacer1(String s) {
        this.stringToReplace = s;
    }

    public String replace() {
        Pattern symbolPattern = Pattern.compile("\\$([a-zA-Z]\\w*)");
        Matcher symbolMatcher = symbolPattern.matcher(stringToReplace);
        while (symbolMatcher.find()) {
            String symbolName = symbolMatcher.group(1);
            if (getSymbol(symbolName) != null && !alreadyReplaced.contains(symbolName)) {
                alreadyReplaced.add(symbolName);
                stringToReplace = stringToReplace.replace("$" + symbolName, translate(symbolName));
            }
        }
        return stringToReplace;
    }

    private String translate(String symbolName) {
        return getSymbol(symbolName);
    }

    private String getSymbol(String symbolName){
        switch (symbolName) {
            case "esclamazione":
                return "YEAH!";
            
            case "saluto":
                return "HOLAA!";

        }
        return symbolName.toUpperCase();
    } 
    	
    public static void main (String[] args) {
		System.out.println("Starting SymbolReplacer1 App main... ");
        SymbolReplacer1 symbolReplacer1 = new SymbolReplacer1("test test $esclamazione test test $saluto test");
        String result = symbolReplacer1.replace();
        System.out.println("result: " + result);
    }	
}