package week2.day1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] temp=test.split("");
		String rev="";
		int i=0;
		for(String s:temp)
		{
			if((i%2)==1)
			{
				for(int j=s.length()-1;j>=0;j--)
					rev=rev+s.charAt(j);
				
			
			System.out.println(rev+"");
			}
			else
			{
				System.out.println(temp[i]+"");
			}
			i++;
	
		}
	}
}
