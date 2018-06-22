 class Hello
{
	public Hello(int a,int b)
	{
		int c=a+b;
		System.out.println("Result : "+c);
	}
}
class MainClassCon
{
	public static void main(String args[])
	{
		Hello obj=new Hello(4,7);
	}
}