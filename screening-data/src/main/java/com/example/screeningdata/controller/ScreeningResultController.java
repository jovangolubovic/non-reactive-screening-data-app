package com.example.screeningdata.controller;

import com.example.screeningdata.entity.ScreeningResult;
import com.example.screeningdata.service.ScreeningResultService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/screening-results")
@RequiredArgsConstructor
public class ScreeningResultController {

    private final ScreeningResultService screeningResultService;

    @GetMapping
    public List<ScreeningResult> findAllData() {
        return screeningResultService.findAllData();
    }


    @PostMapping
    public ScreeningResult saveScreeningResultData(@RequestBody ScreeningResult screeningResult) {
        return screeningResultService.saveScreeningResultData(screeningResult);
    }


    @PutMapping
    public ScreeningResult updateScreeningResultData(@RequestBody ScreeningResult screeningResult) {
        return screeningResultService.updateScreeningResultData(screeningResult);
    }


    @DeleteMapping("/{id}")
    public void deleteScreeningResultData(@PathVariable("id") Long id) {
        screeningResultService.deleteScreeningResultData(id);
    }

}
