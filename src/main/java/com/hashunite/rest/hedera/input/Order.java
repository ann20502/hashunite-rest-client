package com.hashunite.rest.hedera.input;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Order {
    ASCENDING("asc"),
    DESCENDING("desc");

    private final String order;

    private Order(String order) { this.order = order; }

    @JsonValue
    @Override
    public String toString() {
        return order;
    }
}
