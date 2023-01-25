package com.example.screeningdata.controller;

import com.example.screeningdata.entity.ScreeningTask;
import com.example.screeningdata.service.ScreeningTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/screening-task")
@RequiredArgsConstructor
public class ScreeningTaskController {

    private final ScreeningTaskService screeningTaskService;

    @GetMapping
    public List<ScreeningTask> findAllScreeningTasks() {
        return screeningTaskService.findAllScreeningTasks();
    }


    @PostMapping
    public ScreeningTask saveScreeningTask(@RequestBody ScreeningTask screeningTask) {
        return screeningTaskService.saveScreeningTask(screeningTask);
    }


    @PutMapping
    public ScreeningTask updateScreeningTask(@RequestBody ScreeningTask screeningTask) {
        return screeningTaskService.updateScreeningTask(screeningTask);
    }


    @DeleteMapping("/{id}")
    public void deleteScreeningTask(@PathVariable("id") Long id) {
        screeningTaskService.deleteScreeningTask(id);
    }
}
