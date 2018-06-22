interface A
{
	double pi=3.14;
}
class B
{
	protected double ans;
	public void GetData(int r,int h)
	{
		ans=r*r*h;
	}
}
class C extends B implements A
{
	public void Display()
	{
		System.out.println("vol of cylinder"+(ans*pi));
	}
}
class MainClass34
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.GetData(4,2);
		obj.Display();
	}
}