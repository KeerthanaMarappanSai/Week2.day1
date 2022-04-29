package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		//Declaring values to an variable
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter =0,space =0,num =0,specialChar =0;
		//String to Array conversion
		char[] arr= test.toCharArray();
		for(int i=0;  i<test.length(); i++)
		{
			
			//finding Letters in the string
			if(Character.isLetter(arr[i]))
				letter++;
			//finding numbers in the string
			else if(Character.isDigit(arr[i]))
				num++;
			//finding spaces in the string
			else if(Character.isSpaceChar(arr[i]))
				space++;
			//displays the count other than above types
			else
				specialChar++;
				
		}
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("SpecialCharcter: " + specialChar);

		
	}
}
