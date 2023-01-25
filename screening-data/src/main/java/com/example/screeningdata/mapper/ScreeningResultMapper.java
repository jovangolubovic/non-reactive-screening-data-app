package com.example.screeningdata.mapper;

import com.example.screeningdata.entity.ScreeningResult;
import com.example.screeningdata.model.ScreeningResultDto;
import org.mapstruct.Mapper;

@Mapper
public interface ScreeningResultMapper {

    ScreeningResultDto screeningResultToScreeningResultDto(ScreeningResult screeningResult);

}
