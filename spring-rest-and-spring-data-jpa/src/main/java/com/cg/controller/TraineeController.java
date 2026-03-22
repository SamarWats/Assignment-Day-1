package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;
import com.cg.service.TraineeService;

@RestController
@RequestMapping("/trainees")
public class TraineeController {

    @Autowired
    private TraineeService service;

    @GetMapping
    public List<TraineeDTO> getAll() {
        return service.getAllTrainees();
    }

    @GetMapping("/{id}")
    public TraineeDTO getById(@PathVariable int id) {
        return service.getTraineeById(id);
    }

    @GetMapping("/name/{name}")
    public List<TraineeDTO> getByName(@PathVariable String name) {
        return service.getTraineeByName(name);
    }

    @PostMapping
    public TraineeDTO add(@RequestBody TraineeDTO dto) {
        return service.addTrainee(dto);
    }

    @PutMapping
    public TraineeDTO update(@RequestBody TraineeDTO dto) {
        return service.updateTrainee(dto);
    }
    
    @PutMapping("/{id}")
    public TraineeDTO update(@PathVariable int id, @RequestBody TraineeDTO dto) {
        dto.setId(id);
        return service.updateTrainee(dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.deleteTrainee(id);
        return "Deleted successfully";
    }
}