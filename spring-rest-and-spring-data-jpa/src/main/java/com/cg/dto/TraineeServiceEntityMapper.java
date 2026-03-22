package com.cg.dto;

import com.cg.entity.Trainee;

public class TraineeServiceEntityMapper {

    public static Trainee convertObjectToEntity(TraineeDTO dto) {
        return new Trainee(
            dto.getId(),
            dto.getName(),
            dto.getDomain(),
            dto.getLocation()
        );
    }

    public static TraineeDTO convertEntityToDto(Trainee t) {
        return new TraineeDTO(
            t.getTraineeId(),
            t.getTraineeName(),
            t.getTraineeDomain(),
            t.getTraineeLocation()
        );
    }
}