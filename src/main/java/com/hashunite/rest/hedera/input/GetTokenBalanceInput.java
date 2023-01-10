package com.hashunite.rest.hedera.input;

import javax.ws.rs.QueryParam;
import java.util.List;

public class GetTokenBalanceInput {

    @QueryParam("account.id")
    public final String accountId;

    @QueryParam("account.balance")
    public final String accountBalance;

    @QueryParam("order")
    public final Order order;

    @QueryParam("account.publickey")
    public final String publicKey;

    @QueryParam("timestamp")
    public final List<String> timestamp;

    @QueryParam("limit")
    public final Integer limit;

    public GetTokenBalanceInput() {
        this.accountId = null;
        this.accountBalance = null;
        this.order = null;
        this.publicKey = null;
        this.timestamp = null;
        this.limit = null;
    }

    public GetTokenBalanceInput(String accountId, String accountBalance, Order order, String publicKey, List<String> timestamp, Integer limit) {
        this.accountId = accountId;
        this.accountBalance = accountBalance;
        this.order = order;
        this.publicKey = publicKey;
        this.timestamp = timestamp;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "GetTokenBalanceInput{" +
                "accountId='" + accountId + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                ", order=" + order +
                ", publicKey='" + publicKey + '\'' +
                ", timestamp=" + timestamp +
                ", limit=" + limit +
                '}';
    }
}
