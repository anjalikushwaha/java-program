import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;
class LoginUser
{
	public static void main(String args[])
	{
			int res;
			Connection conn=null;
			Statement stmt=null;
			String id,pswd,qry="";
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter ID : ");
			id=sc.next();
			System.out.println("Enter Password : ");
			pswd=sc.next();
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn=DriverManager.getConnection("jdbc:odbc:DSN_USER");
			stmt=conn.createStatement();
		
			qry="Insert into usertbl values(' "+id+" ',' "+pswd+" ') ";

			res=stmt.executeUpdate(qry);

			if(res>0)
			{
				System.out.println("Record Saved Successfully..... ");
			}
			else
			{
				System.out.println("Error: Record not saved. ");
			}		
		
			stmt.close();
			conn.close();
			qry="";
			res=0;
	}
}