package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.TraineeDTO;
import com.cg.dto.TraineeServiceEntityMapper;
import com.cg.entity.Trainee;
import com.cg.repository.ITraineeRepo;

@Service
public class TraineeService implements ITraineeService {

    @Autowired
    private ITraineeRepo repo;

    @Override
    public List<TraineeDTO> getAllTrainees() {
        return repo.findAll()
                .stream()
                .map(TraineeServiceEntityMapper::convertEntityToDto)
                .toList();
    }

    @Override
    public TraineeDTO getTraineeById(int id) {
        Trainee t = repo.findById(id).orElse(null);
        return (t != null) ? TraineeServiceEntityMapper.convertEntityToDto(t) : null;
    }

    @Override
    public TraineeDTO addTrainee(TraineeDTO dto) {
        Trainee t = TraineeServiceEntityMapper.convertObjectToEntity(dto);
        return TraineeServiceEntityMapper.convertEntityToDto(repo.save(t));
    }

    @Override
    public void deleteTrainee(int id) {
        repo.deleteById(id);
    }

    @Override
    public TraineeDTO updateTrainee(TraineeDTO dto) {
        Trainee t = TraineeServiceEntityMapper.convertObjectToEntity(dto);
        return TraineeServiceEntityMapper.convertEntityToDto(repo.save(t));
    }

    @Override
    public List<TraineeDTO> getTraineeByName(String name) {
        return repo.findByTraineeName(name)
                .stream()
                .map(TraineeServiceEntityMapper::convertEntityToDto)
                .toList();
    }
}