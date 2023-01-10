package com.hashunite.rest.hedera.input;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransactionResultType {
    Success("Success"),
    Fail("Fail");

    private final String type;

    private TransactionResultType(String type) {
        this.type = type;
    }

    @JsonValue
    @Override
    public String toString() {
        return type;
    }

}
