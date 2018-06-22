import java.util.Scanner;
class StringBDemo
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("INDIA");
		sb.insert(3,"-");
		System.out.println("String is : "+sb);
		sb.append(" HELLO");
		System.out.println("String is : "+sb);
		sb.reverse();
		System.out.println("String is : "+sb);
		sb.delete(2,5);
		System.out.println("String is : "+sb);
		sb.deleteCharAt(4);
		System.out.println("String is : "+sb);
	}
}