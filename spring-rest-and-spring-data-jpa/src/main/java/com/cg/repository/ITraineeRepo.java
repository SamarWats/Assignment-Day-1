package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.entity.Trainee;
import java.util.List;

public interface ITraineeRepo extends JpaRepository<Trainee, Integer> {
	List<Trainee> findByTraineeName(String traineeName);
}