import.java.util.Scanner;
class SWAPPING
	{
		private int z;
		public void swap(int x,int y)
		{
		System.out.println("Before Swapping :a="+x+", b="+y);
		z=x;		
		x=y;
		y=z;
		System.out.println("After Swapping :a="+x+", b="+y);
		} 
	}
class MAIN _SWAPPING_1
         {
public static void main(String args[])
                        {
		int a,b;
		scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();	
		SWAPPING swp=new SWAPPING();
		swp.swap(a,b);
	       }
}