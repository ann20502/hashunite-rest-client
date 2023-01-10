package com.hashunite.rest.hedera.input;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransactionType {
    ConsensusCreateTopic("CONSENSUSCREATETOPIC"),
    ConsensusDeleteTopic("CONSENSUSDELETETOPIC"),
    ConsensusSubmitMessage("CONSENSUSSUBMITMESSAGE"),
    ConsensusUpdateTopic("CONSENSUSUPDATETOPIC"),
    ContractCall("CONTRACTCALL"),
    ContractCreateInstance("CONTRACTCREATEINSTANCE"),
    ContractDeleteIstance("CONTRACTDELETEINSTANCE"),
    ContractUpdateInstance("CONTRACTUPDATEINSTANCE"),
    CryptoAddLiveHash("CRYPTOADDLIVEHASH"),
    CryptoApproveAllowance("CRYPTOAPPROVEALLOWANCE"),
    CryptoCreateAccount("CRYPTOCREATEACCOUNT"),
    CryptoDelete("CRYPTODELETE"),
    CryptoDeleteAllowance("CRYPTODELETEALLOWANCE"),
    CryptoDeleteLiveHash("CRYPTODELETELIVEHASH"),
    CryptoTransfer("CRYPTOTRANSFER"),
    CryptoUpdateAccount("CRYPTOUPDATEACCOUNT"),
    EthereumTransaction("ETHEREUMTRANSACTION"),
    FileAppend("FILEAPPEND"),
    FileCreate("FILECREATE"),
    FileDelete("FILEDELETE"),
    FileUpdate("FILEUPDATE"),
    Freeze("FREEZE"),
    NodeStakeUpdate("NODESTAKEUPDATE"),
    ScheduleCreate("SCHEDULECREATE"),
    ScheduleDelete("SCHEDULEDELETE"),
    ScheduleSign("SCHEDULESIGN"),
    SystemDelete("SYSTEMDELETE"),
    SystemUndelete("SYSTEMUNDELETE"),
    TokenAssociate("TOKENASSOCIATE"),
    TokenBurn("TOKENBURN"),
    TokenCreation("TOKENCREATION"),
    TokenDeletion("TOKENDELETION"),
    TokenDissociate("TOKENDISSOCIATE"),
    TokenFeeScheduleUpdate("TOKENFEESCHEDULEUPDATE"),
    TokenFreeze("TOKENFREEZE"),
    TokenGrantKYC("TOKENGRANTKYC"),
    TokenMith("TOKENMINT"),
    TokenPause("TOKENPAUSE"),
    TokenRevokeKYC("TOKENREVOKEKYC"),
    TokeUnfreeze("TOKENUNFREEZE"),
    TokenUnpause("TOKENUNPAUSE"),
    TokenUpdate("TOKENUPDATE"),
    TokenWipe("TOKENWIPE"),
    UncheckSubmit("UNCHECKEDSUBMIT"),
    Unknown("UNKNOWN"),
    UntilPRNG("UNTILPRNG");

    private final String type;

    private TransactionType(String type) { this.type = type; }

    @JsonValue
    @Override
    public String toString() {
        return type;
    }

}
