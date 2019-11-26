package week1.day2;
import org.testng.annotations.Test;
import java.sql.*;
public class DBconnection {

	public Connection getcon() {
		Connection con = null;
		try {
		/*Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/one", "root", "root");
		System.out.println("Successfully Connected");*/
		}catch(Exception e) {
			System.out.println("Not Connect");
		}
		return con;
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/one", "root", "root");
		System.out.println("Successfully Connected");
		PreparedStatement smt = con.prepareStatement("select * from em1");
		ResultSet rs = smt.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			System.out.println(id + " " + name);
		}
		
	}

}
