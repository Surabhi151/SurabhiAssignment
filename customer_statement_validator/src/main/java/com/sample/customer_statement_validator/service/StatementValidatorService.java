package com.sample.customer_statement_validator.service;

import com.sample.customer_statement_validator.Result;
import com.sample.customer_statement_validator.model.ErrorRecords;
import com.sample.customer_statement_validator.model.Record;
import com.sample.customer_statement_validator.model.Records;
import com.sample.customer_statement_validator.model.ResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Slf4j
@Service
public class StatementValidatorService {

    List<Record> referenceList = new ArrayList<Record>();
    List<Record> balanceList = new ArrayList<Record>();
    ResponseData responseData;
    String status;

    public ResponseData getValidatedRecords(Records records) {
        log.info("getValidatedRecords Method");
       referenceList = validateReference(records);
       balanceList =  validateBalance(records);
       if(referenceList.isEmpty() && balanceList.isEmpty()) {
           status = Result.SUCCESSFUL.toString();
            responseData.setResult(status);
       }
    /*   else if(!referenceList.isEmpty() && balanceList.isEmpty()) {
           status = Result.DUPLICATE_REFERENCE.toString();
           successfulresponseData.setResult(status);
           errorRecords = callErrorRecords(balanceList);
           responseData.setErrorRecords(errorRecords);

       }*/
       return responseData;
    }
    public List<Record> validateReference(Records records)
    {
            log.info("validateReference Method");
            Set<Record> set = new HashSet<>();
            referenceList = records.getRecords().stream().filter(record -> !set.add(record)).collect(Collectors.toList());
            log.info("ReferenceList", referenceList);
            return referenceList;
    }

    public List<Record> validateBalance(Records records)
    {
        log.info("ValidateBalance Method");
        balanceList =records.getRecords().stream().filter(record -> !record.getStartBalance().add(record.getMutation()).equals(record.getEndBalance())).collect(Collectors.toList());
        log.info("VALIDATEBALANCE", balanceList);
        return balanceList;
    }
}
