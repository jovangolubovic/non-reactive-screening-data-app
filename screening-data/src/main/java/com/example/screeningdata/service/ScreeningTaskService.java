package com.example.screeningdata.service;

import com.example.screeningdata.entity.ScreeningTask;

import java.util.List;

public interface ScreeningTaskService {

    List<ScreeningTask> findAllScreeningTasks();

    ScreeningTask saveScreeningTask(ScreeningTask screeningTask);

    ScreeningTask updateScreeningTask(ScreeningTask screeningTask);

    void deleteScreeningTask(Long id);
}
