package com.sample.customer_statement_validator.service;

import com.sample.customer_statement_validator.Result;
import com.sample.customer_statement_validator.model.ErrorRecords;
import com.sample.customer_statement_validator.model.Record;
import com.sample.customer_statement_validator.model.ResponseData;
import com.sample.customer_statement_validator.model.SuccessfulResponseData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ValidatedResponse {

    List<Record> referenceList = new ArrayList<Record>();
    List<Record> balanceList = new ArrayList<Record>();
    SuccessfulResponseData successfulresponseData = new SuccessfulResponseData();
    ResponseData responseData = new ResponseData();
    ErrorRecords[] errorRecords;
    String status;

    public SuccessfulResponseData getValidatedRecords(Record record) {
       referenceList = validateReference(record);
       balanceList =  validateBalance(record);
       if(referenceList.isEmpty() && balanceList.isEmpty()) {
           status = Result.SUCCESSFUL.toString();
            successfulresponseData.setResult(status);
       }
    /*   else if(!referenceList.isEmpty() && balanceList.isEmpty()) {
           status = Result.DUPLICATE_REFERENCE.toString();
           successfulresponseData.setResult(status);
           errorRecords = callErrorRecords(balanceList);
           responseData.setErrorRecords(errorRecords);

       }*/

       return successfulresponseData;
    }

 /*   public ErrorRecords[] callErrorRecords(List<Record> balanceList) {
       balanceList.forEach(item-> {
            if(item.getReference() != null) {
              errorRecords.setReference(item.getReference());
            }
        });

    }*/

    public List<Record> validateReference(Record record)
    {
            referenceList.add(record);
            Set<Record> set = new HashSet<>();
            referenceList = referenceList.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
            return referenceList;
    }

    public List<Record> validateBalance(Record record) {

        balanceList.add(record);
        balanceList = balanceList.stream().filter(j -> !j.getStartBalance().add(j.getMutation()).equals(j.getEndBalance())).collect(Collectors.toList());
        return balanceList;
    }
}
