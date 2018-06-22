import java.util.Scanner;
import calculator.calculate;
class mani
{
	public static void main(String args[])
	{
	int a,b,c;
	char op;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("enter the choice");
	op=sc.next().charAt(0);
	calculate obj=new calculate();
	switch(op)
	{
	case '+' :
	{
	c=obj.add(a,b) ;
	System.out.println("add="+c);
	}
	break;
	case '-' :
	{
	c=obj.sub(a,b) ;
	System.out.println("sub="+c);
	}
	break;
	}

	}
}