package com.example.screeningdata.mapper;

import com.example.screeningdata.entity.ScreeningResult;
import com.example.screeningdata.model.ScreeningResultDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScreeningResultMapperTest {

    @Test
    public void givenScreeningResultDtoToScreeningResult_whenMaps_thenCorrect(){

        ScreeningResult screeningResult = new ScreeningResult();

        screeningResult.setId(1L);
        screeningResult.setOperator("Operator 1");
        screeningResult.setTpDoc(2L);
        screeningResult.setShipmentNumber(123124321L);
        screeningResult.setBookedByCustomerCode(13241234L);
        screeningResult.setBookedByCustomerName("Customer 1");
        screeningResult.setShipperCustomerCode( 1231432134L );
        screeningResult.setShipperCustomerName( "Shipper 1" );
        screeningResult.setShipperAddressLine1( "Bul 123" );
        screeningResult.setShipperAddressLine2( "BUl 321" );
        screeningResult.setConsigneeCustomerCode( 43212L );
        screeningResult.setConsigneeCustomerName( "Name 1" );
        screeningResult.setConsigneeAddressLine1( "Adresa 1" );
        screeningResult.setFirstNotifyCustomerCode( 43215L );
        screeningResult.setFirstNotifyCustomerName( "Ime 2" );
        screeningResult.setFirstNotifyAddressLine1( "Adress 2" );
        screeningResult.setSecondNotifyCustomerCode( 5623L );
        screeningResult.setSecondNotifyCustomerName( "Name 2" );
        screeningResult.setSecondNotifyAddressLine1( "Petra Kocica 3" );
        screeningResult.setCommodityCode( "4235L Code" );
        screeningResult.setCommodityDescription( "Desc 123" );
        screeningResult.setCargoDocumentationDescription( "Opis 1" );
        screeningResult.setContractualCustomerCustomerCode( 45165L );
        screeningResult.setContractualCustomerCustomerName( "const cust name 1" );
        screeningResult.setHaz( "1234" );
        screeningResult.setPorCountryName( "Serbia" );
        screeningResult.setPodCountryName( "Montenegro" );
        screeningResult.setScreeningTask(null);

        ScreeningResultMapper mapper = new ScreeningResultMapperImpl();
        ScreeningResultDto dto = mapper.screeningResultToScreeningResultDto(screeningResult);
        assertEquals(dto.getConsigneeCustomerCode(), screeningResult.getConsigneeCustomerCode());
        System.out.println(dto);

    }

}
