package com.sample.customer_statement_validator.model;

public class ErrorRecords
{
    private String reference;

    private String accountNumber;

    public String getReference ()
    {
        return reference;
    }

    public void setReference (String reference)
    {
        this.reference = reference;
    }

    public String getAccountNumber ()
    {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString()
    {
        return "ErrorRecords [reference = "+reference+", accountNumber = "+accountNumber+"]";
    }
}
