package singleTonDesignPattern;

import java.sql.SQLException;
import java.util.Scanner;

public class SingleTonDesignPatternExample {
	public static Scanner sk = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		SingleTonDesignClass jdbc = SingleTonDesignClass.getInstance();
		System.out.println("Enter UserName: ");
		String userName = sk.next();
		System.out.println("Enter PassWord: ");
		String passWord = sk.next();
		
		int update = jdbc.insertRecordInCredTable(userName, passWord);
	}
}
