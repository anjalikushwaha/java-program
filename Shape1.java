import java.util.Scanner; 
public class Shape1
 {
  public static void main(String[] args)
 {
	String str;  
	int i,j,k,le;
	   System.out.print("Enter a string: ");
    Scanner in = new Scanner(System.in);
    str = in.nextLine();
  le=str.length();	
    for(i=0;i<le;i++){
	for(j=le-1;j>=i;j--)
	{
        System.out.print(" ");
	}
	for(k=0;k<=i;k++)
	{
		System.out.print(str.charAt(k)+" ");
	}
	System.out.println();
	}
        }
}