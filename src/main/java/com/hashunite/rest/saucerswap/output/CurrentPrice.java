package com.hashunite.rest.saucerswap.output;

import java.math.BigDecimal;

public class CurrentPrice {

    public final int decimals;
    public final String icon;
    public final String id;
    public final String name;
    public final String price;
    public final BigDecimal priceUsd;
    public final String symbol;

    public CurrentPrice(int decimals, String icon, String id, String name, String price, BigDecimal priceUsd, String symbol) {
        this.decimals = decimals;
        this.icon = icon;
        this.id = id;
        this.name = name;
        this.price = price;
        this.priceUsd = priceUsd;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "GetCurrentPriceOutput{" +
                "decimals=" + decimals +
                ", icon='" + icon + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", priceUsd=" + priceUsd +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
