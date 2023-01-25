package com.example.screeningdata.model;

import com.example.screeningdata.entity.ScreeningTask;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ScreeningResultDto {

    private Long id;
    private String operator;
    private Long tpDoc;
    private Long shipmentNumber;
    private Long bookedByCustomerCode;
    private String bookedByCustomerName;
    private Long shipperCustomerCode;
    private String shipperCustomerName;
    private String shipperAddressLine1;
    private String shipperAddressLine2;
    private Long consigneeCustomerCode;
    private String consigneeCustomerName;
    private String consigneeAddressLine1;
    private Long firstNotifyCustomerCode;
    private String firstNotifyCustomerName;
    private String firstNotifyAddressLine1;
    private Long secondNotifyCustomerCode;
    private String secondNotifyCustomerName;
    private String secondNotifyAddressLine1;
    private String commodityCode;
    private String commodityDescription;
    private String cargoDocumentationDescription;
    private Long contractualCustomerCustomerCode;
    private String contractualCustomerCustomerName;
    private String haz;
    private String porCountryName;
    private String podCountryName;
    private ScreeningTask screeningTask;

}
