package com.Service;

import java.util.ArrayList;
import java.util.List;

import com.Bo.TrainBo;
import com.Dao.TrainDaoImpl;
import com.Dao.TrainDaoInter;

public class TrainServiceImpl implements TrainServiceInter {
	@Override
	public TrainBo servtrain(TrainBo train) {
		// TODO Auto-generated method stub
		
		TrainDaoInter daotrain=new TrainDaoImpl();
		train=daotrain.daotrain(train);
		
		return train;
	}

	@Override
	public List<TrainBo> serv() {
		// TODO Auto-generated method stub
		
		TrainDaoInter dao=new TrainDaoImpl();
		List<TrainBo> list=new ArrayList<>();
		list=dao.servdao();
		return list;
	}
	@Override
	public TrainBo editserv(int id) {
		// TODO Auto-generated method stub
		
		TrainDaoInter dao=new TrainDaoImpl();
		TrainBo adharbo=dao.daoedit(id); 
		return adharbo;
	}
	@Override
	public int servpost(TrainBo train) {
		// TODO Auto-generated method stub
		
		TrainDaoInter daoo=new TrainDaoImpl();
		     int count=daoo.daopost(train);
		return count;
	}

	@Override
	public TrainBo getdelete(int id) {
		// TODO Auto-generated method stub
		TrainDaoInter daooo=new TrainDaoImpl();
		TrainBo train=daooo.delete(id);
		return train;	
	}


}
