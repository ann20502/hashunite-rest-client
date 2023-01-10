package com.hashunite.rest.hedera.input;

import java.util.List;

public class GetTokenBalanceInputBuilder {
    private String accountId;
    private String accountBalance;
    private Order order;
    private String publicKey;
    private List<String> timestamp;
    private int limit;

    public GetTokenBalanceInputBuilder setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public GetTokenBalanceInputBuilder setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    public GetTokenBalanceInputBuilder setOrder(Order order) {
        this.order = order;
        return this;
    }

    public GetTokenBalanceInputBuilder setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    public GetTokenBalanceInputBuilder setTimestamp(List<String> timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public GetTokenBalanceInputBuilder setLimit(int limit) {
        this.limit = limit;
        return this;
    }

    public GetTokenBalanceInput createGetTokenBalanceInput() {
        return new GetTokenBalanceInput(accountId, accountBalance, order, publicKey, timestamp, limit);
    }
}