package com.hashunite.rest.hedera.input;

import javax.ws.rs.QueryParam;
import java.util.List;

public class GetTransactionInput {

    @QueryParam("account.id")
    public final String accountId;

    @QueryParam("limit")
    public final Integer limit;

    @QueryParam("order")
    public final Order order;

    @QueryParam("timestamp")
    public final List<String> timestamp;

    @QueryParam("transactiontype")
    public final TransactionType transactionType;

    @QueryParam("result")
    public final TransactionResultType result;

    @QueryParam("type")
    public final BalanceModificationType type;

    public GetTransactionInput() {
        this.accountId = null;
        this.limit = null;
        this.order = null;
        this.timestamp = null;
        this.transactionType = null;
        this.result = null;
        this.type = null;
    }

    public GetTransactionInput(String accountId, Integer limit, Order order, List<String> timestamp, TransactionType transactionType, TransactionResultType result, BalanceModificationType type) {
        this.accountId = accountId;
        this.limit = limit;
        this.order = order;
        this.timestamp = timestamp;
        this.transactionType = transactionType;
        this.result = result;
        this.type = type;
    }

    @Override
    public String toString() {
        return "GetTransactionInput{" +
                "accountId='" + accountId + '\'' +
                ", limit=" + limit +
                ", order=" + order +
                ", timestamp=" + timestamp +
                ", transactionType=" + transactionType +
                ", result=" + result +
                ", type=" + type +
                '}';
    }
}
