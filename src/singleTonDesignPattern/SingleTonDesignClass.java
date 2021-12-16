package singleTonDesignPattern;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class SingleTonDesignClass {
	//private SingleTonDesignClass obj = new SingleTonDesignClass(); //Example of early Instantiation
	private static SingleTonDesignClass obj; //Lazy Instantiation
	//private static Connection jdbcConnection;
	
	//Default Constructor
	private SingleTonDesignClass() {}
	
	public static SingleTonDesignClass getInstance() {
		if(obj == null) {
			obj = new SingleTonDesignClass();
		}
		return obj;
	}
	
	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_platform", "root", "root");
		return con;
	}
	
	public int insertRecordInCredTable(String userName, String passWord) throws SQLException {
		Connection con = null;
		java.sql.PreparedStatement ps = null;
		int recordCounter = 0;
		try {
			con = this.getConnection();
			ps = con.prepareStatement("INSERT INTO CRED T VALUES (?,?)");
			ps.setString(1, userName);
			ps.setString(2, passWord);
			recordCounter = ps.executeUpdate();
			return recordCounter;
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			ps.close();
		}
		return recordCounter;
	}

	
	public void viewData() throws SQLException {
		Connection con = null;
		java.sql.PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = this.getConnection();
			ps = con.prepareStatement("SELECT * FROM CRED T");
			rs = ps.executeQuery();
			while(rs.next()){
				System.out.println("UserName: "+ rs.getString(0));
				System.out.println("PassWord: "+ rs.getString(1));
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			ps.close();
		}
	}
	
	public int deleteData(String userName) throws SQLException{
		Connection con = null;
		java.sql.PreparedStatement ps = null;
		int recordCounter = 0;
		try {
			con = this.getConnection();
			ps = con.prepareStatement("DELETE FROM CRED T WHERE T.USERNAME=?");
			ps.setString(1, userName);
			recordCounter = ps.executeUpdate();
			return recordCounter;
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			ps.close();
		}
		return recordCounter;
	}
}
