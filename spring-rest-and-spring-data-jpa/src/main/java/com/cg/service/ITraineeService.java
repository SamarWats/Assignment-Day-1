package com.cg.service;

import java.util.List;

import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;

public interface ITraineeService {
	List<TraineeDTO> getAllTrainees();
    TraineeDTO getTraineeById(int id);
    List<TraineeDTO> getTraineeByName(String name);
    TraineeDTO addTrainee(TraineeDTO dto);
    TraineeDTO updateTrainee(TraineeDTO dto);
    void deleteTrainee(int id);
}


