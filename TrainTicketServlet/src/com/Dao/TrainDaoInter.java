package com.Dao;

import java.util.List;

import com.Bo.TrainBo;

public interface TrainDaoInter {

	TrainBo daotrain(TrainBo train);

	List<TrainBo> servdao();

	TrainBo daoedit(int id);

	int daopost(TrainBo train);

	TrainBo delete(int id);



	
	

}
