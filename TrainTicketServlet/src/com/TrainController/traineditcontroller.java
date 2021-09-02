package com.TrainController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bo.TrainBo;
import com.Service.TrainServiceImpl;
import com.Service.TrainServiceInter;

public class traineditcontroller extends HttpServlet {
	
	
	TrainServiceInter serv=new TrainServiceImpl();
	
	 public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		 String edit=request.getParameter("id");
		 
		 if(null!=edit && !edit.isEmpty()){
			 
			 int id=Integer.parseInt(edit);
			 
			 TrainBo train=serv.editserv(id);
			 if(null!=train && 0<train.getPassangerId()){
				 
				 request.setAttribute("obj", train);
				 RequestDispatcher redisp=request.getRequestDispatcher("edit.jsp");
				 redisp.forward(request, response);
				 
			 }
			 
		 }
			 	
	}
	 
	 public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		 
		 String passangerid=request.getParameter("passangerId");
		 String passangername=request.getParameter("passangerName");
		 String passangeraddress=request.getParameter("passangerAddress");
		 String passangernumber=request.getParameter("passangerNumber");
		 String gmailid=request.getParameter("gmailId");
		 String despature=request.getParameter("despature");
		 
		 
		 TrainBo train=new TrainBo();
		 
		 
		 if(null!=passangerid){
			 
			int id =Integer.parseInt(passangerid);
			train.setPassangerId(id);
		 }
		 
		 train.setPassangerName(passangername);
		 train.setPassangerAddress(passangeraddress);
		 
		 if(null!=passangernumber){
			 long number=Long.parseLong(passangernumber);
			 train.setPassangerNumber(number);
		 }
		 
		 train.setGmailId(gmailid);
		 train.setDespature(despature);
		 int count=serv.servpost(train);
		 if(0<count){
			 
			 request.setAttribute("successfull", "Successfully Edited");
			 request.setAttribute("obj",train);
			 RequestDispatcher reqdispa=request.getRequestDispatcher("edit.jsp");
			 reqdispa.include(request, response);
			 
		 }
	 }

}
