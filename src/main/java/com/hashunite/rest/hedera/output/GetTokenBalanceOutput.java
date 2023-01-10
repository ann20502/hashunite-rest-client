package com.hashunite.rest.hedera.output;

import java.math.BigDecimal;
import java.util.List;

public class GetTokenBalanceOutput {

    public final String timestamp;
    public final List<Balance> balances;
    public final Link links;

    public GetTokenBalanceOutput() {
        this.timestamp = null;
        this.balances = null;
        this.links = null;
    }

    public GetTokenBalanceOutput(String timestamp, List<Balance> balances, Link links) {
        this.timestamp = timestamp;
        this.balances = balances;
        this.links = links;
    }

    @Override
    public String toString() {
        return "GetTokenBalanceOutput{" +
                "timestamp='" + timestamp + '\'' +
                ", balances=" + balances +
                ", links=" + links +
                '}';
    }

    public static class Balance {

        public final String account;
        public final BigDecimal balanace;

        public Balance() {
            this.account = null;
            this.balanace = null;
        }

        public Balance(String account, BigDecimal balanace) {
            this.account = account;
            this.balanace = balanace;
        }

        @Override
        public String toString() {
            return "Balance{" +
                    "account='" + account + '\'' +
                    ", balanace=" + balanace +
                    '}';
        }
    }

}
