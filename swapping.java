class swapping
{
public static void main(String args[])
{
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
System.out.println("Before SWapping : a="+a+" , b="+b);
c=a;
a=b;
b=c;
System.out.println("After SWapping : a="+a+" , b="+b); 
}
}