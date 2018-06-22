import java.util.Scanner;
class XYZ
{
	int a,b,z;
	public void InputData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void ResultData()
	{
		z=a+b;
		System.out.println("Sum is : "+z);
	}
}
class MainClass21
{
	public static void main(String args[])
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		n1=sc.nextInt();
		System.out.println("Enter Second Number : ");
		n2=sc.nextInt();
		XYZ obj=new XYZ();
		obj.InputData(n1,n2);
		obj.ResultData(); 
	}
}