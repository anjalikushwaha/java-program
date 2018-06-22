class First
{
	First()
	{
		this(4);
		System.out.println("This is First Constructor.");
	}
	First(int x)
	{
		this(4,7);
		System.out.println("This is First Constructor with one parameterised.");
	}
	First(int x,int y)
	{
		System.out.println("This is First Constructor with two parameterised.");
	}
}
class Second extends First
{
	Second()
	{
		super(4);
		System.out.println("This is Second Constructor.");
	}
	Second(int x)
	{
		this();
		System.out.println("This is Second Constructor with one parameterised.");
	}
	Second(int x,int y)
	{
		System.out.println("This is Second Constructor with two parameterised.");
	}
}
class MainClass33
{
	public static void main(String args[])
	{
		Second obj=new Second(8);
	}
}