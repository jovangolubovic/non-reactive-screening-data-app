package com.example.screeningdata.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ScreeningResultControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void findAllData() throws Exception {
//        RequestBuilder request = MockMvcRequestBuilders.get("/screening_results");
//        MvcResult result = mockMvc.perform(request).andReturn();
//        assertThat(result.getResponse().getContentLength()).isGreaterThan(0);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/screening-results")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].operator").value("Operator 1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].tpDoc").value(1233413))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].shipmentNumber").value(34525234))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].bookedByCustomerCode").value(6524552))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].bookedByCustomerName").value("Customer Name 1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].shipperCustomerCode").value(14151123))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].shipperCustomerName").value("Shipper Name 1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].shipperAddressLine1").value("Bul Mil Mil 9dj"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].shipperAddressLine2").value("Bul Zor Djin 128"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].consigneeCustomerCode").value(8921934))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].consigneeCustomerName").value("Consignee Name 1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].consigneeAddressLine1").value("Bul Kr Aleks 19"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].firstNotifyCustomerCode").value(7183812))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].firstNotifyCustomerName").value("Notify Name 1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].firstNotifyAddressLine1").value("Bul Oslob 92"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].secondNotifyCustomerCode").value("8143712"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].secondNotifyCustomerName").value("Second notify name 1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].secondNotifyAddressLine1").value("Bul rev 1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].commodityCode").value("321412"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].commodityDescription").value("21 WC QU 18992"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].cargoDocumentationDescription").value("WLE 87831 SPOPS"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].contractualCustomerCustomerCode").value(32114124))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].contractualCustomerCustomerName").value("Con Cust Name 1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].haz").value("HA1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].porCountryName").value("Serbia"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].podCountryName").value("Montenegro"));

    }

    @Test
    void saveScreeningResultData() {
    }

    @Test
    void updateScreeningResultData() {
    }

    @Test
    void deleteScreeningResultData() {
    }
}