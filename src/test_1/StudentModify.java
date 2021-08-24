package test_1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import test_1.ConnectDB;

public class StudentModify {
	public static ArrayList<Student> findAll() {
		ArrayList<Student> dsHS = new ArrayList<Student>();
		try {
			Connection con = ConnectDB.getConnection();
			String sql = "select * from student";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String fullName = rs.getString(1);
				String gender = rs.getString(2);
				int age = rs.getInt(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				Student student = new Student(fullName,gender,age,email,phone);
				dsHS.add(student);
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsHS;
	}
	public static boolean insert(String fullName, String gender, int age, String email,String phone) {
		try {
			Connection con = ConnectDB.getConnection();
			String sql = "insert into student values(?,?,?,?,?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1,fullName);
			pstm.setString(2, gender);
			pstm.setInt(3, age);
			pstm.setString(4, email);
			pstm.setString(5, phone);
			pstm.executeUpdate();
			return true;
		}catch (SQLException e) {
			System.out.println(e);
			return false;
		}
	}
	public static boolean delete(String fullName) {
		try {
			Connection con = ConnectDB.getConnection();
			String sql = "delete from student where fullname=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, fullName);
			pstm.executeUpdate();
			return true;
		}catch(SQLException e) {
			System.out.println(e);
			return false;
		}
	}
}
