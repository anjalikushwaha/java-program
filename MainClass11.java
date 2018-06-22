import java.util.Scanner;
class ShapePrint
{
	int l=0,i,j,k;
	public void Display(String st)
	{
		l=st.length();
		for(i=0;i<l;i++)
		{
			for(j=l-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print(st.charAt(k)+" ");
			}
			System.out.println();
		}
	}
}
class MainClass11
{
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		str=sc.next();		
		ShapePrint obj=new ShapePrint();
		obj.Display(str);
	}
}