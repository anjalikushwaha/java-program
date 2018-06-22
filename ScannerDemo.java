import java.util.Scanner;
class ScannerDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		float b,s;
		b=sc.nextFloat();
		a=sc.nextInt();
		s=a+b;
		System.out.println("sum is="+s);
	}	
}