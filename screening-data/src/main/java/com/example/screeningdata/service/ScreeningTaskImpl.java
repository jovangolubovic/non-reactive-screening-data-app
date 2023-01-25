package com.example.screeningdata.service;

import com.example.screeningdata.entity.ScreeningTask;
import com.example.screeningdata.repository.ScreeningTaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningTaskImpl implements ScreeningTaskService{

    private final ScreeningTaskRepository screeningTaskRepository;

    public ScreeningTaskImpl(ScreeningTaskRepository screeningTaskRepository) {
        this.screeningTaskRepository = screeningTaskRepository;
    }

    @Override
    public List<ScreeningTask> findAllScreeningTasks() {
        return screeningTaskRepository.findAll();
    }

    @Override
    public ScreeningTask saveScreeningTask(ScreeningTask screeningTask) {
        return screeningTaskRepository.save(screeningTask);
    }

    @Override
    public ScreeningTask updateScreeningTask(ScreeningTask screeningTask) {
        return screeningTaskRepository.save(screeningTask);
    }

    @Override
    public void deleteScreeningTask(Long id) {
        screeningTaskRepository.deleteById(id);
    }
}
