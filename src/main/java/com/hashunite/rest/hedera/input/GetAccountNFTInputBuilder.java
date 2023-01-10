package com.hashunite.rest.hedera.input;

public class GetAccountNFTInputBuilder {
    private String tokenId;
    private String serialNumber;
    private String spenderId;
    private Integer limit;
    private Order order;

    public GetAccountNFTInputBuilder setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    public GetAccountNFTInputBuilder setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public GetAccountNFTInputBuilder setSpenderId(String spenderId) {
        this.spenderId = spenderId;
        return this;
    }

    public GetAccountNFTInputBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public GetAccountNFTInputBuilder setOrder(Order order) {
        this.order = order;
        return this;
    }

    public GetAccountNFTInput createGetAccountNFTInput() {
        return new GetAccountNFTInput(tokenId, serialNumber, spenderId, limit, order);
    }
}