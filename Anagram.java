package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//Declaring values
		String text1="stops";
		String text2="potss";
		//Declaring arrays to store the characters of String
		char[] ch1;
		char[] ch2;
		//validating the length of each string
		int length1 = text1.length();
		int length2 = text2.length();
		//validating the length of two strings
		if(length1!= length2)
		
			System.out.println("It is not an Anagram");
		
		else
		{
			//Storing each character of a string to an array
			ch1=text1.toCharArray();
			ch2=text2.toCharArray();
			//Sorting the Array values
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			//validating the values of two arrays
			boolean equals = Arrays.equals(ch1, ch2);
			if(equals==true)
				System.out.println("It is an Anagram");
			else
				System.out.println("It is not an Anagram");
				
			
		}
		
	}
}
