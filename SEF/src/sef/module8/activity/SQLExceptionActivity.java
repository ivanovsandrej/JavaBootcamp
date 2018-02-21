package sef.module8.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//The following program throws a checked exception. 
public class SQLExceptionActivity {


	public static void main(String[] args) {

			String url = "jdbc:mysql://localhost/activity1"; 
			String user = "root";
			String pass = "abcd1234";
			
			//The following code would not compile unless it's put inside a try catch
			//1 - put it in a try block and handle ClassNotFoundException

		try {
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch (ClassNotFoundException e)
			{e.printStackTrace();}
			Connection cn = null;
			try {
				cn = DriverManager.getConnection(url, user, pass);
			}
			catch (SQLException e){e.printStackTrace();}
			System.out.println("Connection successfully established! \n");

			try {
			cn.close();
			} catch (SQLException e) {e.printStackTrace();}
			
			//2 - You also need to catch SQLException for it to compile
			
	
	}

}
