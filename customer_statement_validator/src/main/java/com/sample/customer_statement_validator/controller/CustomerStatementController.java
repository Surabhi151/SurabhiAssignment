package com.sample.customer_statement_validator.controller;

import com.sample.customer_statement_validator.model.Record;
import com.sample.customer_statement_validator.model.ResponseData;
import com.sample.customer_statement_validator.model.SuccessfulResponseData;
import com.sample.customer_statement_validator.service.ValidatedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class CustomerStatementController {
    @Autowired
    RestTemplate restTemplate;
    ValidatedResponse validatedResponse = new ValidatedResponse();

//    @PostMapping(value = "customer/record")
//    public ResponseEntity<ResponseData> getCustomerRecord() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<String> entity = new HttpEntity(headers);
//        return restTemplate.exchange("http://localhost:8080", HttpMethod.POST,entity, ResponseData.class);
//    }

    @PostMapping("/request")
    public SuccessfulResponseData postController(@RequestBody Record record) {

        SuccessfulResponseData data = validatedResponse.getValidatedRecords(record);
        return  data;


    }

}
