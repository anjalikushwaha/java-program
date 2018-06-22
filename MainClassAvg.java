import java.util.Scanner;
class Average
{
	private int n,m;
	public Average(int x,int y)
	{
		n=x;
		m=y;
	}
	public Average(Average ob)
	{
		double res=(double)(ob.n+ob.m)/2;
		System.out.println("Average is : "+res);
	}
}
class MainClassAvg
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		Average obj1=new Average(a,b);
		Average obj2=new Average(obj1);
	}
}