import java.util.Scanner;
import java.io.*;
class fhandling2
{
	public static void main(String args[])throws IOException
	{
		String str ="this is my life-handling";
		FileWriter fw =new FileWriter("E:/q.txt");
		BufferedWriter br=new BufferedWriter(fw);

		br.write(str);
		br.close();
		System.out.println("msg write succesfully");
	}
}