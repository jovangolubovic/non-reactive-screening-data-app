package com.example.screeningdata.service;

import com.example.screeningdata.entity.ScreeningResult;
import com.example.screeningdata.repository.ScreeningResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningResultImpl implements ScreeningResultService {

    private final ScreeningResultRepository screeningResultRepository;

    public ScreeningResultImpl(ScreeningResultRepository screeningResultRepository) {
        this.screeningResultRepository = screeningResultRepository;
    }

    @Override
    public List<ScreeningResult> findAllData() {

        return screeningResultRepository.findAll();
    }

    @Override
    public ScreeningResult saveScreeningResultData(ScreeningResult screeningResult) {
        return screeningResultRepository.save(screeningResult);
    }

    @Override
    public ScreeningResult updateScreeningResultData(ScreeningResult screeningResult) {
        return screeningResultRepository.save(screeningResult);
    }

    @Override
    public void deleteScreeningResultData(Long id) {
        screeningResultRepository.deleteById(id);
    }


}
