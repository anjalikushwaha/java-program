import java.util.Scanner;
class Parameter
{
	int n,m;
	public Parameter (int l,int b)
	{
		n=l;
		m=b;
	}
	public Parameter(Parameter ob)
	{
		int res=(ob.n>ob.m)?ob.n:ob.m;
		System.out.println("Greatest Number is : "+res);
	}
}
class areaRect
{
public static void main(String args[])
	{
		Parameter obj1=new Parameter(4,9);
		Parameter obj2=new Parameter(obj1);
	}
}   