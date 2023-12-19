import java.sql.*;

public class Update {
	public static void createstudent() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/pet";
	String username="root";
	String password="0908";
	String Query="update dog set name='maha' where id=1001";
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.executeUpdate();
	con.close();
		
		
	}
	
	
	
	
	

	public static void main(String[]args) throws Exception{
       createstudent();
		
	}
}

