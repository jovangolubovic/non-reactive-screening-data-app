package com.example.screeningdata.repository;

import com.example.screeningdata.entity.ScreeningTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningTaskRepository extends JpaRepository<ScreeningTask, Long> {

}
