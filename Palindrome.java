package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		//Value initiation
		String text = "MadaM";
		String rev = "";
		char temp;
		//Storing the reversal string of each char
		for (int i=0; i<text.length(); i++)
		{
			temp=text.charAt(i);
			rev=temp+rev;
		
		}
		System.out.println("Reversal string is: "+rev);
		//equals method
		boolean equals = text.equals(rev);
		//equalsIgnoreCase method
		boolean equalsIgnoreCase = text.equalsIgnoreCase(rev);
		//conditional loop for equal method
		if(equals == true)
			System.out.println("It is a Palindrome");
		else
		{
			//converts to non-case sensitive and validate the string
			if(equalsIgnoreCase==true)
				System.out.println("It is a Palindrome");
			else
			System.out.println("It is not a Palindrome");
		}
		
	}

}
