package com.admin.Studentmange.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.admin.Studentmange.web.Student_model;




public class StudentDao {
	
	
	public void addStduent(Student_model s) throws SQLException
	{
		DatebaseConnection dao=new DatebaseConnection();
		Connection con=dao.getConnection();
		String query="insert into new_table(fullname,gender,email,DOB,contact,city) values(?,?,?,?,?,?)";
		PreparedStatement stud=con.prepareStatement(query);
	   // stud.setInt(1,s.getId());
		stud.setString(1,s.getFullname());
		stud.setString(2,s.getGender());
		stud.setString(3,s.getEmail());
		stud.setString(4,s.getDOB());
		stud.setString(5,s.getContact());
		stud.setString(6,s.getCity());
		stud.executeUpdate();
		
	
	}
	public ArrayList<Student_model> showAllStudent() throws SQLException
	{		
		ArrayList<Student_model> list=new ArrayList<Student_model>();
		DatebaseConnection dao=new DatebaseConnection();
		Connection con=dao.getConnection();
		String query="select * from new_table";
		Statement stud=con.createStatement();
		ResultSet rs=stud.executeQuery(query);
		while(rs.next())
		{
			Student_model s=new Student_model();
			s.setId(rs.getInt(1));
			s.setFullname(rs.getString(2));
			s.setGender(rs.getString(3));
			s.setEmail(rs.getString(4));
			s.setDOB(rs.getString(5));
			s.setContact(rs.getString(6));
			s.setCity(rs.getString(7));
			list.add(s);
		}
		return list;
		
	}
	
	public void deletedata(int id) throws SQLException
	{
		DatebaseConnection dao=new DatebaseConnection();
		Connection con=dao.getConnection();	
		PreparedStatement stud=con.prepareStatement("delete from new_table where id="+id);
		stud.executeUpdate();
	}
	 
	public Student_model getdataById(int id) throws SQLException 
	{
		Student_model s=new Student_model();
		DatebaseConnection dao=new DatebaseConnection();
		Connection con=dao.getConnection();	
		String query="select * from new_table where id="+id;
		Statement stud=con.createStatement();
		ResultSet rs=stud.executeQuery(query);
		while(rs.next())
		{
			s.setId(id);
			s.setFullname(rs.getString(2));
			s.setGender(rs.getString(3));
			s.setEmail(rs.getString(4));
			s.setDOB(rs.getString(5));
			s.setContact(rs.getString(6));
			s.setCity(rs.getString(7));
		}
		return s;
		
		
	}
	
	public void updatedata(Student_model s) throws SQLException 
	{
		DatebaseConnection dao=new DatebaseConnection();
		Connection con=dao.getConnection();	
		String query="update new_table set fullname=?,gender=?,email=?,DOB=?,contact=?,city=?where id=?";
		PreparedStatement stud=con.prepareStatement(query);
			stud.setString(1,s.getFullname());
			stud.setString(2,s.getGender());
			stud.setString(3,s.getEmail());
			stud.setString(4,s.getDOB());
			stud.setString(5,s.getContact());
			stud.setString(6,s.getCity());
			stud.setInt(7,s.getId());
		    stud.executeUpdate();
	}
	
//	public boolean checkDuplicateEmail(Student_model s) throws SQLException
//	{    
//		int count=0;
//		DatebaseConnection dao=new DatebaseConnection();
//		Connection con=dao.getConnection();	
//		String query="select count(*) from new_table where email=?";
//		PreparedStatement stud=con.prepareStatement(query);
//		stud.setString(3,s.getEmail());
//		ResultSet rs=stud.executeQuery(query);
//		while(rs.next())
//			{
//			count=rs.getInt(1);	
//			}
//		if(count <0) {
//			System.out.println("Email is valid");		
//		}
//		else
//		{
//			System.out.println("your email new");
//		}
//		return false;
//	}
	
		 }
	 
  

