package words_rev;

import java.util.Scanner;

public class wordsrev {
	
	
	public void reverse(char []s,int start,int end)
	{
		
		int i=start;
		int j=end;
		
		while(i<=j)
		{
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
		
		
		
	}
	
	public void reverse_words(char []s)
	{
		int start=0;
	    
		for(int i=start;i<s.length;i++)
		{
			if(s[i]==' ')
			{
				
				reverse(s,start,i-1);
				start=i+1;
			}
			
			
			
		}
		//rev last word
	reverse(s,start,s.length-1);
		
		// rev whole statement
		reverse(s,0,s.length-1);
	}

	public static void main(String[] args) {
		// get input from user 
		// convert to char arr and sento reverse
		
		wordsrev rv=new wordsrev();
		System.out.println("Input string");
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		char s[]=str.toCharArray();
		
		System.out.println("Input string is"+str);
		
		rv.reverse_words(s);
		
		System.out.println("output string is");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
		

	}

}
