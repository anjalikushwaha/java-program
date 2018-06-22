class Hello
{
	int eno;
	String name;
	float salary;
	Hello()
	{
		eno=12;
		name="Mohit";
		salary=2345.67f;
	}
	public void ShowData()
	{
		System.out.println("Employee Number : "+eno);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+salary);	
	}
}
class MainClass22
{
	public static void main(String args[])
	{
		Hello obj=new Hello();
		obj.ShowData();
	}
}