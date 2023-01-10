package com.hashunite.rest.hedera.output;

import java.util.List;

public class GetAccountNFTOutput {

    private List<NFT> nfts;
    private Link links;

    public List<NFT> getNfts() {
        return nfts;
    }

    public Link getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return "GetAccountNFTOutput{" +
                "nfts=" + nfts +
                ", links=" + links +
                '}';
    }

    public static class NFT {

        private String account_id;
        private String created_timestamp;
        private boolean deleted;
        private String metadata;
        private String modified_timestamp;
        private Long serial_number;
        private String token_id;

        public String getAccount_id() {
            return account_id;
        }

        public String getCreated_timestamp() {
            return created_timestamp;
        }

        public boolean isDeleted() {
            return deleted;
        }

        public String getMetadata() {
            return metadata;
        }

        public String getModified_timestamp() {
            return modified_timestamp;
        }

        public Long getSerial_number() {
            return serial_number;
        }

        public String getToken_id() {
            return token_id;
        }

        @Override
        public String toString() {
            return "NFT{" +
                    "account_id='" + account_id + '\'' +
                    ", created_timestamp='" + created_timestamp + '\'' +
                    ", deleted=" + deleted +
                    ", metadata='" + metadata + '\'' +
                    ", modified_timestamp='" + modified_timestamp + '\'' +
                    ", serial_number=" + serial_number +
                    ", token_id='" + token_id + '\'' +
                    '}';
        }
    }

}
