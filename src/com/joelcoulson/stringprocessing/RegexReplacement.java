package com.joelcoulson.stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplacement {	
	
	public static void main(String[] args) {
		String sentence = "This is a simple sentence which contains a street address" +
			"(Address: 49 Varland Ave, Mount Crescent), and a phone number of 75555-55555";

		// generating a new pattern to replace just the phone number
		Pattern pattern = Pattern.compile("\\d{5}-\\d{5}");
		Matcher matcher = pattern.matcher(sentence);
		String replacedText = matcher.replaceAll("88888-88888");
		System.out.println(replacedText);	
	}
}
