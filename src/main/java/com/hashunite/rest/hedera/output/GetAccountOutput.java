package com.hashunite.rest.hedera.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAccountOutput {

    private String account;
    private String alias;
    private String auto_renew_period;
    private Balance balance;
    private String create_timestamp;
    private boolean decline_reward;
    private boolean deleted;
    private BigDecimal ethereum_nonce;
    private String evm_address;
    private String expiry_timestamp;
    private Object key;
    private BigDecimal max_automatic_toke_associations;
    private String memo;
    private BigDecimal pending_reward;
    private boolean receiver_sig_required;
    private String staked_account_id;
    private BigDecimal staked_node_id;
    private String stake_period_start;

    public String getAccount() {
        return account;
    }

    public String getAlias() {
        return alias;
    }

    public String getAuto_renew_period() {
        return auto_renew_period;
    }

    public Balance getBalance() {
        return balance;
    }

    public String getCreate_timestamp() {
        return create_timestamp;
    }

    public boolean isDecline_reward() {
        return decline_reward;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public BigDecimal getEthereum_nonce() {
        return ethereum_nonce;
    }

    public String getEvm_address() {
        return evm_address;
    }

    public String getExpiry_timestamp() {
        return expiry_timestamp;
    }

    public Object getKey() {
        return key;
    }

    public BigDecimal getMax_automatic_toke_associations() {
        return max_automatic_toke_associations;
    }

    public String getMemo() {
        return memo;
    }

    public BigDecimal getPending_reward() {
        return pending_reward;
    }

    public boolean isReceiver_sig_required() {
        return receiver_sig_required;
    }

    public String getStaked_account_id() {
        return staked_account_id;
    }

    public BigDecimal getStaked_node_id() {
        return staked_node_id;
    }

    public String getStake_period_start() {
        return stake_period_start;
    }

    @Override
    public String toString() {
        return "GetAccountOutput{" +
                "account='" + account + '\'' +
                ", alias='" + alias + '\'' +
                ", auto_renew_period='" + auto_renew_period + '\'' +
                ", balance=" + balance +
                ", create_timestamp='" + create_timestamp + '\'' +
                ", decline_reward=" + decline_reward +
                ", deleted=" + deleted +
                ", ethereum_nonce=" + ethereum_nonce +
                ", evm_address='" + evm_address + '\'' +
                ", expiry_timestamp='" + expiry_timestamp + '\'' +
                ", key='" + key + '\'' +
                ", max_automatic_toke_associations=" + max_automatic_toke_associations +
                ", memo='" + memo + '\'' +
                ", pending_reward=" + pending_reward +
                ", receiver_sig_required=" + receiver_sig_required +
                ", staked_account_id='" + staked_account_id + '\'' +
                ", staked_node_id=" + staked_node_id +
                ", stake_period_start='" + stake_period_start + '\'' +
                '}';
    }

    public static class Balance {

        private String timestamp;
        private BigDecimal balance;
        private List<Token> tokens;

        public String getTimestamp() {
            return timestamp;
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
                    "timestamp='" + timestamp + '\'' +
                    ", balance=" + balance +
                    ", tokes=" + tokens +
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
