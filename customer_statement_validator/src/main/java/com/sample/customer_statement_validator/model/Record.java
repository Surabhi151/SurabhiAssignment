package com.sample.customer_statement_validator.model;

import java.math.BigDecimal;

public class Record {
    private BigDecimal startBalance;

    private String description;

    private BigDecimal endBalance;

    private int reference;

    private BigDecimal mutation;

    private String accountNumber;

    public BigDecimal getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(BigDecimal startBalance) {
        this.startBalance = startBalance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getEndBalance() {
        return endBalance;
    }

    public void setEndBalance(BigDecimal endBalance) {
        this.endBalance = endBalance;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public BigDecimal getMutation() {
        return mutation;
    }

    public void setMutation(BigDecimal mutation) {
        this.mutation = mutation;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "startBalance='" + startBalance + '\'' +
                ", description='" + description + '\'' +
                ", endBalance='" + endBalance + '\'' +
                ", reference='" + reference + '\'' +
                ", mutation='" + mutation + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

}
