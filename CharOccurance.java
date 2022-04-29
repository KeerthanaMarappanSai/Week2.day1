package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		//Initializing variables
		String str = "welcome to chennai";
		int temp=0;
		//Storing the string characters in an Array
		char[] arr = str.toCharArray();
		//Length of String
		int length =str.length();
		System.out.println("Length of the String is: "+length);
		//Getting the occurance of C in the declared String
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]== 'c')
			{
				temp=temp+1;
			}	
				
        }
		System.out.println("Number of Character Occurance of C is:  "+temp);	
		
	}
}
