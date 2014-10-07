package com.joelcoulson.stringprocessing;

public class StringSearching {

    public static void main(String[] args) {
        testIndexOf();
        testIndexOf2();
        regionMatches();
    }

    public static void testIndexOf() {
        String sentence = "This is just a test";
        System.out.println("The word 'just' appears at index: " + sentence.indexOf("just"));
    }

    public static void testIndexOf2() {
        String sentence = "This is yet another test to test the indexOf method";
        System.out.println("The word 'just' appears at index: " + sentence.indexOf("test", 10));
    }

    public static void regionMatches() {
        String sentence = "This is to test a region within a given string which is\n" +
                "separated by quite a few newline characters\n" +
                "in the course of it's writing";

        // first get the index of the region we're looking to search within
        int startIndex = sentence.indexOf('\n');

        // match sure we've found a match before continuing
        if(startIndex > -1) {
            String matchString = "separated by quite a few newline characters";
            // search from the start of the stringIndex, looking for the entire matchString
            if(sentence.regionMatches(startIndex+1, matchString, 0, matchString.length())) {
                System.out.println("Found a match for '" + matchString + "'");
            } else {
                System.out.println("No match");
            }
        }
    }

    public static void tokenize() {
        String sentence = "This is a simple sentence that we’re going to break up";
        String[] words = sentence.split(" ");
    }
}
