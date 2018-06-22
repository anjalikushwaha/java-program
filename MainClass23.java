class Hello
{
	Hello()
	{
		System.out.println("This is Default Constructor");
	}
	Hello(int x)
	{
		this();
		System.out.println("This is one parameterised Constructor");
	}
	Hello(int x,int y)
	{
		this(3);
		System.out.println("This is two parameterised Constructor");
	}
}
class MainClass23
{
	public static void main(String args[])
	{
		Hello obj=new Hello(4,2);
	}
}