package com.hashunite.rest.hedera.output;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GetTokenByIdOutput {

    public final Key admin_key;
    public final String auto_renew_account;
    public final String auto_renew_period;
    public final String created_timestamp;
    public final boolean deleted;
    public final BigDecimal decimals;
    public final String expiry_timestamp;
    public final boolean freeze_default;
    public final Key freeze_key;
    public final BigDecimal initial_supply;
    public final Key kyc_key;
    public final BigDecimal max_supply;
    public final String memo;
    public final String modified_timestamp;
    public final String name;
    public final Key pause_key;
    public final String pause_status;
    public final Key supply_key;
    public final String supply_type;
    public final String symbol;
    public final String token_id;
    public final BigDecimal total_supply;
    public final String treasury_account_id;
    public final String type;
    public final Key wipe_key;
    public final CustomFee custom_fees;

    public GetTokenByIdOutput() {
        this.admin_key = null;
        this.auto_renew_account = null;
        this.auto_renew_period = null;
        this.created_timestamp = null;
        this.deleted = false;
        this.decimals = null;
        this.expiry_timestamp = null;
        this.freeze_default = false;
        this.freeze_key = null;
        this.initial_supply = null;
        this.kyc_key = null;
        this.max_supply = null;
        this.memo = null;
        this.modified_timestamp = null;
        this.name = null;
        this.pause_key = null;
        this.pause_status = null;
        this.supply_key = null;
        this.supply_type = null;
        this.symbol = null;
        this.token_id = null;
        this.total_supply = null;
        this.treasury_account_id = null;
        this.type = null;
        this.wipe_key = null;
        this.custom_fees = null;
    }

    public GetTokenByIdOutput(Key admin_key, String auto_renew_account, String auto_renew_period, String created_timestamp, boolean deleted, BigDecimal decimals, String expiry_timestamp, boolean freeze_default, Key freeze_key, BigDecimal initial_supply, Key kyc_key, BigDecimal max_supply, String memo, String modified_timestamp, String name, Key pause_key, String pause_status, Key supply_key, String supply_type, String symbol, String token_id, BigDecimal total_supply, String treasury_account_id, String type, Key wipe_key, CustomFee custom_fees) {
        this.admin_key = admin_key;
        this.auto_renew_account = auto_renew_account;
        this.auto_renew_period = auto_renew_period;
        this.created_timestamp = created_timestamp;
        this.deleted = deleted;
        this.decimals = decimals;
        this.expiry_timestamp = expiry_timestamp;
        this.freeze_default = freeze_default;
        this.freeze_key = freeze_key;
        this.initial_supply = initial_supply;
        this.kyc_key = kyc_key;
        this.max_supply = max_supply;
        this.memo = memo;
        this.modified_timestamp = modified_timestamp;
        this.name = name;
        this.pause_key = pause_key;
        this.pause_status = pause_status;
        this.supply_key = supply_key;
        this.supply_type = supply_type;
        this.symbol = symbol;
        this.token_id = token_id;
        this.total_supply = total_supply;
        this.treasury_account_id = treasury_account_id;
        this.type = type;
        this.wipe_key = wipe_key;
        this.custom_fees = custom_fees;
    }

    @Override
    public String toString() {
        return "GetTokenByIdOutput{" +
                "admin_key=" + admin_key +
                ", auto_renew_account='" + auto_renew_account + '\'' +
                ", auto_renew_period='" + auto_renew_period + '\'' +
                ", created_timestamp='" + created_timestamp + '\'' +
                ", deleted=" + deleted +
                ", decimals=" + decimals +
                ", expiry_timestamp='" + expiry_timestamp + '\'' +
                ", freeze_default=" + freeze_default +
                ", freeze_key=" + freeze_key +
                ", initial_supply=" + initial_supply +
                ", kyc_key=" + kyc_key +
                ", max_supply=" + max_supply +
                ", memo='" + memo + '\'' +
                ", modified_timestamp='" + modified_timestamp + '\'' +
                ", name='" + name + '\'' +
                ", pause_key=" + pause_key +
                ", pause_status='" + pause_status + '\'' +
                ", supply_key=" + supply_key +
                ", supply_type='" + supply_type + '\'' +
                ", symbol='" + symbol + '\'' +
                ", token_id='" + token_id + '\'' +
                ", total_supply=" + total_supply +
                ", treasury_account_id='" + treasury_account_id + '\'' +
                ", type='" + type + '\'' +
                ", wipe_key=" + wipe_key +
                ", custom_fees=" + custom_fees +
                '}';
    }

    public static class Key {

        public final String _type;
        public final String key;

        public Key() {
            _type = null;
            key = null;
        }

        public Key(String _type, String key) {
            this._type = _type;
            this.key = key;
        }

        @Override
        public String toString() {
            return "AdminKey{" +
                    "_type='" + _type + '\'' +
                    ", key=" + key +
                    '}';
        }
    }

    public static class CustomFee {

        public final String created_timestamp;
        public final List<Fee> fixed_fees;
        public final List<FractionalFee> fractional_fees;

        public CustomFee() {
            this.created_timestamp = null;
            this.fixed_fees = new ArrayList<>();
            this.fractional_fees = new ArrayList<>();
        }

        public CustomFee(String created_timestamp, List<Fee> fixed_fees, List<FractionalFee> fractional_fees) {
            this.created_timestamp = created_timestamp;
            this.fixed_fees = fixed_fees;
            this.fractional_fees = fractional_fees;
        }

        @Override
        public String toString() {
            return "CustomFee{" +
                    "created_timestamp='" + created_timestamp + '\'' +
                    ", fixed_fees=" + fixed_fees +
                    ", fractional_fees=" + fractional_fees +
                    '}';
        }
    }

    public static class Fee {

        public final BigDecimal amount;
        public final String collector_account_id;
        public final String denomination_token_id;

        public Fee() {
            this.amount = null;
            this.collector_account_id = null;
            this.denomination_token_id = null;
        }

        public Fee(BigDecimal amount, String collector_account_id, String denomination_token_id) {
            this.amount = amount;
            this.collector_account_id = collector_account_id;
            this.denomination_token_id = denomination_token_id;
        }

        @Override
        public String toString() {
            return "Fee{" +
                    "amount=" + amount +
                    ", collector_account_id='" + collector_account_id + '\'' +
                    ", denomination_token_id='" + denomination_token_id + '\'' +
                    '}';
        }
    }

    public static class Amount {

        public final BigDecimal numerator;
        public final BigDecimal denominator;

        public Amount() {
            numerator = null;
            denominator = null;
        }

        public Amount(BigDecimal numerator, BigDecimal denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        @Override
        public String toString() {
            return "Amount{" +
                    "numerator=" + numerator +
                    ", denominator=" + denominator +
                    '}';
        }
    }

    public static class FractionalFee {

        public final Amount amount;
        public final String collector_account_id;
        public final String denominating_token_id;
        public final BigDecimal maximum;
        public final BigDecimal minimum;
        public final boolean net_of_transfers;

        public FractionalFee() {
            this.amount = null;
            this.collector_account_id = null;
            this.denominating_token_id = null;
            this.maximum = null;
            this.minimum = null;
            this.net_of_transfers = false;
        }

        public FractionalFee(Amount amount, String collector_account_id, String denominating_token_id, BigDecimal maximum, BigDecimal minimum, boolean net_of_transfers) {
            this.amount = amount;
            this.collector_account_id = collector_account_id;
            this.denominating_token_id = denominating_token_id;
            this.maximum = maximum;
            this.minimum = minimum;
            this.net_of_transfers = net_of_transfers;
        }

        @Override
        public String toString() {
            return "FractionalFee{" +
                    "amount=" + amount +
                    ", collector_account_id='" + collector_account_id + '\'' +
                    ", denominating_token_id='" + denominating_token_id + '\'' +
                    ", maximum=" + maximum +
                    ", minimum=" + minimum +
                    ", net_of_transfers=" + net_of_transfers +
                    '}';
        }
    }

}
