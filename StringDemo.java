import java.util.Scanner;
class StringDemo
{
	public static void main(String args[])
	{
		String str,aa="star",bb="STAR";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		str=sc.next();
		System.out.println("In Upper-Case : "+str.toUpperCase());
		System.out.println("In Lower-Case : "+str.toLowerCase());
		System.out.println("In Replace : "+str.replace('m','w'));
		System.out.println("Concatenation : "+str.concat(" India"));
		System.out.println("Substring-1 : "+str.substring(2));
		System.out.println("Substring-2 : "+str.substring(2,3));
		System.out.println("Character At : "+str.charAt(5));
		System.out.println("Index  : "+str.indexOf('o'));
		if(aa.equals(bb))
		{
			System.out.println("Both Strings are Same ");
		}
		else
		{
			System.out.println("Both Strings are not Same ");
		}

		if(aa.equalsIgnoreCase(bb))
		{
			System.out.println("Both Strings are Same ");
		}
		else
		{
			System.out.println("Both Strings are not Same ");
		}
	}	
}