class MyThreadA extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
			sleep(2000);
			System.out.println("This is ThreadA : "+i);
			}
		}
		catch(Exception ee){}
	}
}
class MyThreadB extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
			sleep(1000);
			System.out.println("This is ThreadB : "+i);
			}
		}
		catch(Exception ee1){}
	}
}
class MainThreadDemo
{
	public static void main(String args[])
	{
		MyThreadA objA=new MyThreadA();
		MyThreadB objB=new MyThreadB();
		objA.start();
		objB.start();		
	}
}