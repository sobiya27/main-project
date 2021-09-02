package com.TrainController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bo.TrainBo;
import com.Service.TrainServiceImpl;
import com.Service.TrainServiceInter;

public class TrainController extends HttpServlet {
	
  public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
	  
	  List<TrainBo> list=new ArrayList<TrainBo>();
	  TrainServiceInter service=new TrainServiceImpl();
	  
 	  list=service.serv();
	  if(null!=list && 0<list.size()&& !list.isEmpty()){
		  
		  request.setAttribute("object",list );
		  RequestDispatcher reqdis=request.getRequestDispatcher("view.jsp");
		  reqdis.forward(request, response);
	  }	  
  }

  public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
	  
           String passangername=request.getParameter("passangerName"); 
           String passangeraddress=request.getParameter("passangerAddress");
           String passangernumber=request.getParameter("passangerNumber");
           String gmaild=request.getParameter("gmailId");
           String despature=request.getParameter("Despature");
           
           
           TrainBo train=new TrainBo();
           
           train.setPassangerName(passangername);
           train.setPassangerAddress(passangeraddress);
          
           if(null!=passangernumber){
        	  long num=Long.parseLong(passangernumber);
        	     train.setPassangerNumber(num);	   
           }
           train.setGmailId(gmaild);
           train.setDespature(despature);
	  
           TrainServiceInter trainser=new TrainServiceImpl();
     
           train=trainser.servtrain(train);
           if(null!=train && 0<train.getPassangerId())
        	   
        	   request.setAttribute("alertmsg", "Reservation is Succesfully Updated");
        	   RequestDispatcher reqdisp=request.getRequestDispatcher("trainreservation.jsp");
        	   reqdisp.forward(request, response);
           }
           
  }
