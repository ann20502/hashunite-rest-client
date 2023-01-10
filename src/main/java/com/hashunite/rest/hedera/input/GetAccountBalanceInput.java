package com.hashunite.rest.hedera.input;

import javax.ws.rs.QueryParam;
import java.util.List;

public class GetAccountBalanceInput {

    @QueryParam("account.id")
    public final String id;

    @QueryParam("account.balance")
    public final String balance;

    @QueryParam("account.publickey")
    public final String publickey;

    @QueryParam("timestamp")
    public final List<String> timestamp;

    @QueryParam("limit")
    public final Integer limit;

    public GetAccountBalanceInput() {
        id = null;
        balance = null;
        publickey = null;
        timestamp = null;
        limit = null;
    }

    public GetAccountBalanceInput(String id, String balance, String publickey, List<String> timestamp, Integer limit) {
        this.id = id;
        this.balance = balance;
        this.publickey = publickey;
        this.timestamp = timestamp;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "GetAccountBalanceInput{" +
                "id='" + id + '\'' +
                ", balance='" + balance + '\'' +
                ", publickey='" + publickey + '\'' +
                ", timestamp=" + timestamp +
                ", limit=" + limit +
                '}';
    }

}
