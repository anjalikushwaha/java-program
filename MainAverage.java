import java.util.Scanner;
class Average
{
	int n,m;
	public Average(int a,int b )
		{
		n=a;
		m=b;
		}
		public Average(Average obj )
		{
	int res=(n+m)/2;
	System.out.println("Average is:"+res);
		}
}
class MainAverage
{
public static void main(String args[])
{
Average obj1=new Average(2,3);
Average obj2=new Average(obj1);
	}
}