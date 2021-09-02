package com.Service;

import java.util.List;

import com.Bo.TrainBo;

public interface TrainServiceInter {

	TrainBo servtrain(TrainBo train);

	List<TrainBo> serv();

	TrainBo editserv(int id);

	int servpost(TrainBo train);

	TrainBo getdelete(int id);
}
