package com.hashunite.rest.hedera;

import com.hashunite.rest.hedera.input.GetAccountBalanceInput;
import com.hashunite.rest.hedera.output.GetAccountBalanceOutput;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RegisterRestClient(configKey = "hedera-api")
public interface HederaBalanceService {

    @GET
    @Path("/api/v1/balances")
    Uni<GetAccountBalanceOutput> getAccountBalance(@BeanParam GetAccountBalanceInput input);

}
