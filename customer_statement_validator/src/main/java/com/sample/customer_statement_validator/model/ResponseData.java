package com.sample.customer_statement_validator.model;

public class ResponseData
{
    private String result;

    private ErrorRecords errorRecords;

    public String getResult ()
    {
        return result;
    }

    public void setResult (String result)
    {
        this.result = result;
    }

    public ErrorRecords getErrorRecords ()
    {
        return errorRecords;
    }

    public void setErrorRecords (ErrorRecords errorRecords)
    {
        this.errorRecords = errorRecords;
    }

    @Override
    public String toString()
    {
        return "ResponeData [result = "+result+", errorRecords = "+errorRecords+"]";
    }

}

