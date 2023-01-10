package com.hashunite.rest.saucerswap;

import com.hashunite.rest.saucerswap.output.CurrentPrice;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@RegisterRestClient(configKey = "ss-api")
public interface SSPriceService {

    @GET
    @Path("/tokens")
    Uni<List<CurrentPrice>> getCurrentPrice();

}
