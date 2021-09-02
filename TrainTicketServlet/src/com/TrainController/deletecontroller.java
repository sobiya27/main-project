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

public class deletecontroller extends HttpServlet {
	
	TrainServiceInter serv=new TrainServiceImpl();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response ) throws ServletException, IOException{
		
		String delete=request.getParameter("id");
		if(null!=delete){
			
			 int id=Integer.parseInt(delete);
			 
			TrainBo train= serv.getdelete(id);
			if(null!=train && 0<train.getPassangerId()){
				request.setAttribute("delete", "deleted msg");
				
				  List<TrainBo> list=new ArrayList<TrainBo>();
				  TrainServiceInter service=new TrainServiceImpl();
				
				  list=service.serv();
				  if(null!=list && 0<list.size()){
					  
					  request.setAttribute("object",list );
					  RequestDispatcher reqdis=request.getRequestDispatcher("view.jsp");
					  reqdis.forward(request, response);
				
			}
		}
		
	}
	
}
}