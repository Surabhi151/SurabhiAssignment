package com.sample.customer_statement_validator.model;

import java.util.ArrayList;
import java.util.List;

public class ErrorRecords {
    List<ErrorRecord> errorRecords = new ArrayList<>();

    public List<ErrorRecord> getErrorRecords() {
        return errorRecords;
    }

    public void setErrorRecords(List<ErrorRecord> errorRecords) {
        this.errorRecords = errorRecords;
    }

    @Override
    public String toString() {
        return "ErrorRecords{" +
                "errorRecords=" + errorRecords +
                '}';
    }
}
