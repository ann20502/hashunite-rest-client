# Rest-Client

This project serves as a library for all public API being used by the main project.

## Configurations

1. Include this project as a dependency 

2. In `/resources/application.properties`, configure the base URL / environment you would like to use:
   - `%dev.hedera-api/mp-rest/url=https://mainnet-public.mirrornode.hedera.com`
   - `%dev.ss-api/mp-rest/url=https://api.saucerswap.finance`


### You may start using the library:

```
@Dependent
public class GetTokenPrice {

    SSPriceService priceService;

    public GetTokenPrice(@RestClient SSPriceService priceService) {
        this.priceService = priceService;
    }

}
```