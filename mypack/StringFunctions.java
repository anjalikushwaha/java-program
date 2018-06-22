package mypack;
public class StringFunctions
{
	public int CountVowels(String str)
	{
		int n=0,i;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				n++;
			}
		}
		return(n);		
	}
} 