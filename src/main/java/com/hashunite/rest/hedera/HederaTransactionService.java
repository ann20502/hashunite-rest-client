package com.hashunite.rest.hedera;

import com.hashunite.rest.hedera.input.GetTransactionInput;
import com.hashunite.rest.hedera.output.GetTransactionOutput;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RegisterRestClient(configKey = "hedera-api")
public interface HederaTransactionService {

    @GET
    @Path("/api/v1/transactions")
    Uni<GetTransactionOutput> getTransaction(@BeanParam GetTransactionInput input);

}
