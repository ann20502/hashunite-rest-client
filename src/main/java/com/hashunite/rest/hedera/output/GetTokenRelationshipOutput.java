package com.hashunite.rest.hedera.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTokenRelationshipOutput {

    private List<Token> tokens;
    private Link links;

    public List<Token> getTokens() {
        return tokens;
    }

    public Link getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return "GetTokenRelationshipOutput{" +
                "tokens=" + tokens +
                ", links=" + links +
                '}';
    }

    public static class Token {

        private boolean automatic_association;
        private BigDecimal balance;
        private String created_timestamp;
        private String freeze_status;
        private String kyc_status;
        private String token_id;

        public boolean isAutomatic_association() {
            return automatic_association;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public String getCreated_timestamp() {
            return created_timestamp;
        }

        public String getFreeze_status() {
            return freeze_status;
        }

        public String getKyc_status() {
            return kyc_status;
        }

        public String getToken_id() {
            return token_id;
        }

        @Override
        public String toString() {
            return "Token{" +
                    "automatic_association=" + automatic_association +
                    ", balance=" + balance +
                    ", created_timestamp='" + created_timestamp + '\'' +
                    ", freeze_status='" + freeze_status + '\'' +
                    ", kyc_status='" + kyc_status + '\'' +
                    ", token_id='" + token_id + '\'' +
                    '}';
        }
    }

}
