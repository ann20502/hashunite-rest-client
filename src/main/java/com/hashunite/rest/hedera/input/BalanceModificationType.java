package com.hashunite.rest.hedera.input;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BalanceModificationType {
    Credit("credit"),
    Debit("debit");

    private final String type;

    private BalanceModificationType(String type) { this.type = type; }

    @JsonValue
    @Override
    public String toString() {
        return type;
    }

}
