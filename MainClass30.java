interface AA
{
	double pi=3.14;
	void GetData(int radius); 
}
class BB implements AA
{
	public void GetData(int radius)
	{
		double ans=pi*radius*radius;
		System.out.println("Area of Circle : "+ans);
	}	
}
class MainClass30
{
	public static void main(String args[])
	{
		BB obj=new BB();
		obj.GetData(5);
	}
}