package com.hashunite.rest.hedera;

import com.hashunite.rest.hedera.input.GetAccountNFTInput;
import com.hashunite.rest.hedera.input.Order;
import com.hashunite.rest.hedera.output.GetAccountNFTOutput;
import com.hashunite.rest.hedera.output.GetAccountOutput;
import com.hashunite.rest.hedera.output.GetTokenRelationshipOutput;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;

@RegisterRestClient(configKey = "hedera-api")
public interface HederaAccountService {

    @GET
    @Path("/api/v1/accounts/{idOrAliasOrEvmAddress}")
    Uni<GetAccountOutput> getAccount(
            @PathParam("idOrAliasOrEvmAddress") String idOrAliasOrEvmAddress,
            @QueryParam("transactiontype") String transactionType
    );

    @GET
    @Path("/api/v1/accounts/{idOrAliasOrEvmAddress}/nfts")
    Uni<GetAccountNFTOutput> getNFTs(
            @PathParam("idOrAliasOrEvmAddress") String idOrAliasOrEvmAddress,
            @BeanParam GetAccountNFTInput input
    );

    @GET
    @Path("/api/v1/accounts/{idOrAliasOrEvmAddress}/tokens")
    Uni<GetTokenRelationshipOutput> getTokenRelationship(
            @PathParam("idOrAliasOrEvmAddress") String idOrAliasOrEvmAddress,
            @QueryParam("token.id") String tokenId,
            @QueryParam("limit") Integer limit,
            @QueryParam("order") Order order
    );

}
