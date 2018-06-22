abstract class AbsDemo
{
	public void GetData()
	{
		System.out.println("This is GetData Method");
	}
	abstract public void ShowData();
}
class ChildAbsDemo extends AbsDemo
{
	public void ResultData()
	{
		System.out.println("This is ResultData Method");
	}
	public void ShowData()
	{
		System.out.println("This is ShowData Method");
	}
}
class MainClassAbsDemo
{
	public static void main(String args[])
	{
		ChildAbsDemo obj=new ChildAbsDemo();
		obj.GetData();
		obj.ResultData();
		obj.ShowData();		
	}
}