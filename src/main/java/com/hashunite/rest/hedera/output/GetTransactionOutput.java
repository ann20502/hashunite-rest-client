package com.hashunite.rest.hedera.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTransactionOutput {

    private List<Transaction> transactions;
    private Link links;

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Link getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return "GetTransactionOutput{" +
                "transactions=" + transactions +
                ", links=" + links +
                '}';
    }

    public static class Transaction {

        private String bytes;
        private BigDecimal charged_tx_fee;
        private String consensus_timestamp;
        private String entity_id;
        private BigDecimal max_fee;
        private String memo_base64;
        private String name;
        private String node;
        private int nonce;
        private String parent_consensus_timestamp;
        private String result;
        private boolean scheduled;
        private String transaction_hash;
        private String transaction_id;
        private List<Token> transfers;
        private List<Token> token_transfers;
        private int valid_duration_seconds;
        private String valid_start_timestamp;

        public String getBytes() {
            return bytes;
        }

        public BigDecimal getCharged_tx_fee() {
            return charged_tx_fee;
        }

        public String getConsensus_timestamp() {
            return consensus_timestamp;
        }

        public String getEntity_id() {
            return entity_id;
        }

        public BigDecimal getMax_fee() {
            return max_fee;
        }

        public String getMemo_base64() {
            return memo_base64;
        }

        public String getName() {
            return name;
        }

        public String getNode() {
            return node;
        }

        public int getNonce() {
            return nonce;
        }

        public String getParent_consensus_timestamp() {
            return parent_consensus_timestamp;
        }

        public String getResult() {
            return result;
        }

        public boolean isScheduled() {
            return scheduled;
        }

        public List<Token> getTransfers() {
            return transfers;
        }

        public List<Token> getToken_transfers() {
            return token_transfers;
        }

        public String getTransaction_hash() {
            return transaction_hash;
        }

        public String getTransaction_id() {
            return transaction_id;
        }

        public int getValid_duration_seconds() {
            return valid_duration_seconds;
        }

        public String getValid_start_timestamp() {
            return valid_start_timestamp;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "bytes='" + bytes + '\'' +
                    ", charged_tx_fee=" + charged_tx_fee +
                    ", consensus_timestamp='" + consensus_timestamp + '\'' +
                    ", entity_id='" + entity_id + '\'' +
                    ", max_fee=" + max_fee +
                    ", memo_base64='" + memo_base64 + '\'' +
                    ", name='" + name + '\'' +
                    ", node='" + node + '\'' +
                    ", nonce=" + nonce +
                    ", parent_consensus_timestamp='" + parent_consensus_timestamp + '\'' +
                    ", result='" + result + '\'' +
                    ", scheduled=" + scheduled +
                    ", transaction_hash='" + transaction_hash + '\'' +
                    ", transaction_id='" + transaction_id + '\'' +
                    ", transfers=" + transfers +
                    ", token_transfers=" + token_transfers +
                    ", valid_duration_seconds=" + valid_duration_seconds +
                    ", valid_start_timestamp='" + valid_start_timestamp + '\'' +
                    '}';
        }
    }

    public static class Token {

        private String token_id;
        private String account;
        private BigDecimal amount;
        private boolean is_approval;

        public String getToken_id() {
            return token_id;
        }

        public String getAccount() {
            return account;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public boolean isIs_approval() {
            return is_approval;
        }

        @Override
        public String toString() {
            return "Token{" +
                    "token_id='" + token_id + '\'' +
                    ", account='" + account + '\'' +
                    ", amount=" + amount +
                    ", is_approval=" + is_approval +
                    '}';
        }
    }

}
