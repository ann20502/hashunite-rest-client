package com.hashunite.rest.hedera.input;

import javax.ws.rs.QueryParam;

public class GetAccountNFTInput {

    @QueryParam("token.id")
    public final String tokenId;

    @QueryParam("serialnumber")
    public final String serialNumber;

    @QueryParam("spender.id")
    public final String spenderId;

    @QueryParam("limit")
    public final Integer limit;

    @QueryParam("order")
    public final Order order;

    public GetAccountNFTInput() {
        this.tokenId = null;
        this.serialNumber = null;
        this.spenderId = null;
        this.limit = null;
        this.order = null;
    }

    public GetAccountNFTInput(String tokenId, String serialNumber, String spenderId, Integer limit, Order order) {
        this.tokenId = tokenId;
        this.serialNumber = serialNumber;
        this.spenderId = spenderId;
        this.limit = limit;
        this.order = order;
    }
}
