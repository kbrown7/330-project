
import java.sql.*;
public class Interface {

	/**
	 * @param args
	 * David Snellings
	 * Brent Steffey
	 */
	/**public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface i = new Interface();
		i.connectToAndQueryDatabase("Kbrown","    ");
	}**/

	public void connectToAndQueryDatabase(String username, String password) {

		try{
	    Connection con = DriverManager.getConnection(
	                         "jdbc:mysql://localhost:3306/mydb",
	                         username,
	                         password);
	    System.out.println("HERE");
	    Statement st = con.createStatement();
	    String table = 
	    "CREATE TABLE Employee11(Emp_code integer, Emp_name varchar(10))";
	    st.executeUpdate(table);
	    System.out.println("Table creation process successfully!");
	}
		catch(SQLException e){}
	}
	
}
