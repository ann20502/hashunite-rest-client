package com.hashunite.rest.hedera.input;

import java.util.List;

public class GetAccountBalanceInputBuilder {
    private String id;
    private String balance;
    private String publickey;
    private List<String> timestamp;
    private Integer limit;

    public GetAccountBalanceInputBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public GetAccountBalanceInputBuilder setBalance(String balance) {
        this.balance = balance;
        return this;
    }

    public GetAccountBalanceInputBuilder setPublickey(String publickey) {
        this.publickey = publickey;
        return this;
    }

    public GetAccountBalanceInputBuilder setTimestamp(List<String> timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public GetAccountBalanceInputBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public GetAccountBalanceInput createGetAccountBalanceInput() {
        return new GetAccountBalanceInput(id, balance, publickey, timestamp, limit);
    }
}