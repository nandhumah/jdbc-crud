import java.sql.*;
public class Get {
public static void getstudent() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/pet";
	String username="root";
	String password="0908";
	String Query="select* from dog";
	Connection con=DriverManager.getConnection(url, username, password);
	Statement pst=con.createStatement();
	ResultSet rs=pst.executeQuery(Query);
	while(rs.next()) {
		System.out.println("id"+rs.getInt(1));
		System.out.println("name"+rs.getString(2));
		System.out.println("email"+rs.getString(3));
	}
	con.close();
}
public static void main(String[]args) throws Exception {
	getstudent();
}
}
