package com.sample.customer_statement_validator.controller;

import com.sample.customer_statement_validator.model.Record;
import com.sample.customer_statement_validator.model.Records;
import com.sample.customer_statement_validator.model.ResponseData;
import com.sample.customer_statement_validator.service.StatementValidatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class CustomerStatementController {
    @Autowired
    StatementValidatorService validatorService;

    @PostMapping("/request")
    public ResponseData postController(@RequestBody Records records) {
        log.info("Controller page", records.getRecords());
        //log.info("Controller Page", records.getAccountNumber());
        ResponseData responseData = validatorService.getValidatedRecords(records);
        log.info("response", responseData);
        return  responseData;
    }

}
