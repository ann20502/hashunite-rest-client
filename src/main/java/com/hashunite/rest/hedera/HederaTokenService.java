package com.hashunite.rest.hedera;

import com.hashunite.rest.hedera.input.GetTokenBalanceInput;
import com.hashunite.rest.hedera.output.GetTokenBalanceOutput;
import com.hashunite.rest.hedera.output.GetTokenByIdOutput;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;

@RegisterRestClient(configKey = "hedera-api")
public interface HederaTokenService {

    @GET
    @Path("/api/v1/tokens/{tokenId}")
    Uni<GetTokenByIdOutput> getTokenById(
            @PathParam("tokenId") String tokenId,
            @QueryParam("timestamp") String timestamp
    );

    @GET
    @Path("/api/v1/tokens/{tokenId}/balances")
    Uni<GetTokenBalanceOutput> getTokenBalance(
            @PathParam("tokenId") String tokenId,
            @BeanParam GetTokenBalanceInput input
    );

}
