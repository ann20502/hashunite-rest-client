package com.hashunite.rest.common.filter;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// For debug purpose, best is to get rid of it
public class HederaClientResponseFilter implements ClientResponseFilter {

    @Override
    public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) throws IOException {
        System.out.println("Request uri: " + requestContext.getUri().toString());
        System.out.println("HTTP Response code: " + responseContext.getStatus());
        MultivaluedMap<String,String> headers = responseContext.getHeaders();
        System.out.println("HTTP Response header: " + headers.toString());
        String content = new String(responseContext.getEntityStream().readAllBytes(), StandardCharsets.UTF_8);
        System.out.println("Response: " + content);
    }

}
