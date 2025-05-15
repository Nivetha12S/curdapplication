package DAOEmployee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import PojoEmployee.EmployeePojo;

public class EmployeeDAO {
	
	public static Connection getConnection() {
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapplication","root", "");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	public static void insert(EmployeePojo emp) {
		String name1 = emp.getName();
		String age1 = emp.getAge();
		String email1 = emp.getEmail();
		String address1 = emp.getAddress();
		
		try {
			Connection con=EmployeeDAO.getConnection();
			String insert="insert into practice (name,age,email,address) values(?,?,?,?)";
			PreparedStatement prst=con.prepareStatement(insert);
			prst.setString(1, name1);
			prst.setString(2, age1);
			prst.setString(3, email1);
			prst.setString(4, address1);
			int rs=prst.executeUpdate();
			
			if(rs==1) {
				System.out.println("Success");
			}else {
				System.out.println("Failed");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static List<EmployeePojo> selectAllData() {
		ArrayList<EmployeePojo> list=new ArrayList<EmployeePojo>();
		
		try {
			Connection con=EmployeeDAO.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select* from practice");
			
			while(rs.next()) {
				String id2=rs.getString(1);
				String name2=rs.getString(2);
				String age2=rs.getString(3);
				String email2=rs.getString(4);
				String address2=rs.getString(5);
				list.add(new EmployeePojo(id2,name2,age2,email2,address2));
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
		
	}
	
	public static void update(EmployeePojo emp) {
		
		String name2 = emp.getName();
		String age2 = emp.getAge();
		String email2 = emp.getEmail();
		String address2 = emp.getAddress();
		String id2 = emp.getId();
		
		try {
			Connection con=EmployeeDAO.getConnection();
			String update="update practice set name=?,age=?,email=?,address=? where id=?";
			PreparedStatement prst=con.prepareStatement(update);
			prst.setString(1, name2);
			prst.setString(2, age2);
			prst.setString(3, email2);
			prst.setString(4, address2);
			prst.setString(5, id2);
			int rs=prst.executeUpdate();
			
			if(rs==1) {
				System.out.println("Success");
			}else {
				System.out.println("Failed");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static List<EmployeePojo> selectParticularData(int id) {
		ArrayList<EmployeePojo> list=new ArrayList<EmployeePojo>();
		
		try {
			Connection con=EmployeeDAO.getConnection();
			String select="select* from practice where id=?";
			PreparedStatement prst=con.prepareStatement(select);
			prst.setInt(1, id);
			ResultSet rs=prst.executeQuery();
			
			while(rs.next()) {
				String id2=rs.getString(1);
				String name2=rs.getString(2);
				String age2=rs.getString(3);
				String email2=rs.getString(4);
				String address2=rs.getString(5);
				list.add(new EmployeePojo(id2,name2,age2,email2,address2));
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
		
	}
	
	public static void delete(int id) {
		
		try {
			Connection con=EmployeeDAO.getConnection();
			String dlt="delete from practice where id=?";
			PreparedStatement prst=con.prepareStatement(dlt);
			prst.setInt(1, id);
			int rs=prst.executeUpdate();
			
			if(rs==1) {
				System.out.println("Success");
			}else {
				System.out.println("Failed");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
