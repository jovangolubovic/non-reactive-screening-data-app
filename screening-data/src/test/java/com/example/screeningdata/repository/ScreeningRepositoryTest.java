package com.example.screeningdata.repository;

import com.example.screeningdata.entity.ScreeningResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ActiveProfiles("local")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ScreeningRepositoryTest {

    @Autowired
    ScreeningResultRepository screeningResultRepository;

    @Test
    void testFindAllData(){
        List<ScreeningResult> screeningResultsList = screeningResultRepository.findAll();
        assertThat(screeningResultsList).size().isGreaterThan(0);
    }

    @Test
    void testSaveScreeningResultData(){
        ScreeningResult screeningResult = new ScreeningResult();
        screeningResult.setOperator("Operator Num 3");
        ScreeningResult savedScreeningResultData = screeningResultRepository.save(screeningResult);

        assertNotNull(savedScreeningResultData);
        assertNotNull(savedScreeningResultData.getId());

        ScreeningResult fetchedOrder = screeningResultRepository.getById(savedScreeningResultData.getId());

        assertNotNull(fetchedOrder);
        assertNotNull(fetchedOrder.getId());
    }

    @Test
    void testUpdateScreeningResultData(){
        ScreeningResult screeningResult = screeningResultRepository.findById(1L).get();
        screeningResult.setOperator("Operator Updated");
        screeningResultRepository.save(screeningResult);
        assertNotEquals("Operator 1", screeningResultRepository.findById(1L).get().getOperator());
    }

    @Test
    void deleteScreeningResultData(){
        screeningResultRepository.deleteById(1L);
        assertThat(screeningResultRepository.existsById(1L)).isFalse();
    }

}
