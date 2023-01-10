package com.hashunite.rest.hedera.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAccountBalanceOutput {

    private String timestamp;
    private List<Balance> balances;
    private Link links;

    public String getTimestamp() {
        return timestamp;
    }

    public List<Balance> getBalances() {
        return balances;
    }

    public Link getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return "GetAccountBalanceOutput{" +
                "timestamp='" + timestamp + '\'' +
                ", balances=" + balances +
                ", links=" + links +
                '}';
    }

    public static class Balance {

        private String account;
        private BigDecimal balance;
        private List<Token> tokens;

        public String getAccount() {
            return account;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public List<Token> getTokens() {
            return tokens;
        }

        @Override
        public String toString() {
            return "Balance{" +
                    "account='" + account + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }

    public static class Token {

        private String token_id;
        private BigDecimal balance;

        public String getToken_id() {
            return token_id;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        @Override
        public String toString() {
            return "Token{" +
                    "token_id='" + token_id + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }

}
