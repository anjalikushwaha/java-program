 import java.util.Scanner;
class DEMO
{
	private int a,b,c;
	public void GetData(int x,int y)
	{
		a=x;
		b=y;
	}
	public void Result()
	{
		c=a+b;
		System.out.println("Result is : "+c);
	}
}
class CLASS_MAIN
{
	public static void main(String args[])
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		DEMO dm=new DEMO();
		dm.GetData(n1,n2);
		dm.Result();
	}
}