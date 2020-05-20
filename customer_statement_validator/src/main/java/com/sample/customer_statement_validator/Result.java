package com.sample.customer_statement_validator;

public enum Result {
    SUCCESSFUL,
    DUPLICATE_REFERENCE,
    INCORRECT_END_BALANCE,
    DUPLICATE_REFERENCE_INCORRECT_END_BALANCE,
    BAD_REQUEST,
    INTERNAL_SERVER_ERROR
}
