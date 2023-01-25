package com.example.screeningdata.service;

import com.example.screeningdata.entity.ScreeningResult;

import java.util.List;

public interface ScreeningResultService {

    List<ScreeningResult> findAllData();

    ScreeningResult saveScreeningResultData(ScreeningResult screeningResult);

    ScreeningResult updateScreeningResultData(ScreeningResult screeningResult);

    void deleteScreeningResultData(Long id);

}
