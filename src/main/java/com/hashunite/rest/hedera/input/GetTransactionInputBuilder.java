package com.hashunite.rest.hedera.input;

import java.util.List;

public class GetTransactionInputBuilder {
    private String accountId;
    private Integer limit;
    private Order order;
    private List<String> timestamp;
    private TransactionType transactionType;
    private TransactionResultType result;
    private BalanceModificationType type;

    public GetTransactionInputBuilder setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public GetTransactionInputBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public GetTransactionInputBuilder setOrder(Order order) {
        this.order = order;
        return this;
    }

    public GetTransactionInputBuilder setTimestamp(List<String> timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public GetTransactionInputBuilder setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    public GetTransactionInputBuilder setResult(TransactionResultType result) {
        this.result = result;
        return this;
    }

    public GetTransactionInputBuilder setType(BalanceModificationType type) {
        this.type = type;
        return this;
    }

    public GetTransactionInput createGetTransactionInput() {
        return new GetTransactionInput(accountId, limit, order, timestamp, transactionType, result, type);
    }
}