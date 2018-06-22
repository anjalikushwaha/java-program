import java.util.Scanner;
import mypack.StringFunctions;
class MainClassUsePack
{
	public static void main(String args[])
	{
		int num;
		String st;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		st=sc.next();
		StringFunctions sf=new StringFunctions();
		num=sf.CountVowels(st);
		System.out.println("Total Vowels are : "+num);
	}
}