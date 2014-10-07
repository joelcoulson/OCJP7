package com.joelcoulson.stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexes {	
		public static void main(String[] args) {
			String sentence = "This is a simple sentence which contains a street address" +
				"(Address: 49 Varland Ave, Mount Crescent), and an email address of joel@something.com";

			// generating a new pattern to display all words
			Pattern pattern1 = Pattern.compile("\\w+");
			Matcher matcher1 = pattern1.matcher(sentence);
			showMatchResults(matcher1);		

			// generating a new pattern to display all numbers
			Pattern pattern2 = Pattern.compile("\\d+");
			Matcher matcher2 = pattern2.matcher(sentence);
			showMatchResults(matcher2);

			// generating a new pattern to display the email address
			Pattern pattern3 = Pattern.compile("\\w+@\\w+.\\w+");
			Matcher matcher3 = pattern3.matcher(sentence);
			showMatchResults(matcher3);
			
			// generating a new pattern to display the street address
			Pattern pattern4 = Pattern.compile("Address: .+\\)");
			Matcher matcher4 = pattern4.matcher(sentence);
			showMatchResults(matcher4);
		}

		public static void showMatchResults(Matcher matcher) {
			// attempts to find the next subsequence of the input sequence that matches the pattern
			while(matcher.find()) {
				// Returns the input subsequence matched by the previous match
				System.out.println(matcher.group());
		}
	}
}
