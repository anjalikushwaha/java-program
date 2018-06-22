import java.util.Scanner;
class INSIDE
{
	private int total=0;
	public void Insider(String s,String v)
		{	
			for(int i=0;i<s.length();i++)
			{	
				String onechar=s.substring(i,i+1);
				if(v.indexOf(onechar)!=-1)
				{
					System.out.println(onechar);
					total=total+1;
				}
			}
			System.out.println("");
			System.out.println("total vowels:"+total);
		}
}
class MAIN_INSIDE
{
	public static void main(String args[])
	{
		String str;
		String vowels="AEIOUaeiou";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String : ");
		str=sc.next();
		INSIDE ins=new INSIDE();
ins.Insider(str,vowels);
}
}	