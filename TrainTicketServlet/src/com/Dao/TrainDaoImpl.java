package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Bo.TrainBo;

public class TrainDaoImpl implements TrainDaoInter {

	@Override
	public TrainBo daotrain(TrainBo train) {
		// TODO Auto-generated method stub
		
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/trainregistration","root","admin");  
			Statement stmt=con.createStatement();
			String sql="insert into train(passangerName, passangerAddress, passangerNumber, gmailId, Despature) value ('"+train.getPassangerName()+"','"+train.getPassangerAddress()+"',"+train.getPassangerNumber()+",'"+train.getGmailId()+"','"+train.getDespature()+"')";
			stmt.execute(sql);
			int id=stmt.getUpdateCount();
			if(0<id){
				train.setPassangerId(id);
			}
			con.close();  
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
			
		}	
		
		return train;
	}

	@Override
	public List<TrainBo> servdao() {
		// TODO Auto-generated method stub
		
		List<TrainBo> listref=new ArrayList<TrainBo>();
		
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/trainregistration","root","admin");  
			Statement stmt=con.createStatement();
			ResultSet re=stmt.executeQuery("select * from train"); 
			
			while(re.next()){
	            
				TrainBo trainref=new TrainBo();
				trainref.setPassangerId(re.getInt(1));
				trainref.setPassangerName(re.getString(2));
				trainref.setPassangerAddress(re.getString(3));
				trainref.setPassangerNumber(re.getLong(4));
				trainref.setGmailId(re.getString(5));
				trainref.setDespature(re.getString(6));
			
				listref.add(trainref);
				
			}	
			con.close();	
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return listref ;
	}

	@Override
	public TrainBo daoedit(int id) {
		
		TrainBo trainbo=new TrainBo(); 
try{
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/trainregistration","root","admin");  
			Statement stmt=con.createStatement();
			ResultSet re=stmt.executeQuery("select *from train where passangerId="+id+"");
			while(re.next()){
				
				trainbo.setPassangerId(re.getInt(1));
				trainbo.setPassangerName(re.getString(2));
				trainbo.setPassangerAddress(re.getString(3));
				trainbo.setPassangerNumber(re.getLong(4));
				trainbo.setGmailId(re.getString(5));
				trainbo.setDespature(re.getString(6));
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return trainbo;
	}

	@Override
	public int daopost(TrainBo train) {
		// TODO Auto-generated method stub
		
		        int count=0;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/trainregistration","root","admin");  
			Statement stmt=con.createStatement();
			String sql="update train set passangerName='"+train.getPassangerName()+"',passangerAddress='"+train.getPassangerAddress()+"',passangerNumber="+train.getPassangerNumber()+",gmailId='"+train.getGmailId()+"',despature='"+train.getDespature()+"' where passangerId="+train.getPassangerId()+"";
			stmt.executeUpdate(sql);
			count=stmt.getUpdateCount();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return count;
	}

	@Override
	public TrainBo delete(int id) {
		// TODO Auto-generated method stub
		
		TrainBo trainbo=new TrainBo();
		int count=0;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/trainregistration","root","admin");  
			Statement stmt=con.createStatement();
			String sql="delete from train where passangerId="+id+"";
			stmt.executeUpdate(sql);
			count=stmt.getUpdateCount();
			trainbo.setPassangerId(count);
			con.close();
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return trainbo;
	}
}
