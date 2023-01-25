package com.example.screeningdata.repository;

import com.example.screeningdata.entity.ScreeningResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningResultRepository extends JpaRepository<ScreeningResult, Long> {
}
