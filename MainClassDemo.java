class SuperDemoA
{
	protected int x,y;
	public void GetData(int a,int b)
	{
		x=a;
		y=b;
	}
}
class SubDemoA extends SuperDemoA
{
	private int res;
	public int ShowData()
	{
		res=(x>y)?x:y;
		return(res);	
	}
}
class MainClassDemo
{
	public static void main(String args[])
	{
		int r;
		SubDemoA sd=new SubDemoA();
		sd.GetData(4,5);
		r=sd.ShowData();
		System.out.println("Answer is : "+r);		
	}
}