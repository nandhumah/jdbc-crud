 import java.sql.*;
public class Ref {
	public static void createstudent() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/pet";
		String username="root";
		String password="0908";
		String Query="insert into dog values(?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, 1001);
		pst.setString(2, "shree");
		pst.setInt(3, 23);
		pst.executeUpdate();
		con.close();
		
	}
	
	
	
	
	

	public static void main(String[]args) throws Exception{
       createstudent();  
}
}