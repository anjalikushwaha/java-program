import java.util.Scanner;
public class ChangePattern
	{
		public static void  main(String [] args)
	{
			String str,str1,str2;
			int i,le;
			System.out.println("enter the string");
		Scanner in =new Scanner (System.in);
			str=in.nextLine();
		le=str.length();
			str1=str.substring(0,1);
			str2=str.substring(1,le-1);
	System.out.println("First String : "+str1);
	System.out.println("Second String : "+str2);
	}
	}
