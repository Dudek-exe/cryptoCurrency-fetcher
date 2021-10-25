package com.cryptoccyfethcer.cryptocurrencyfetcher.external.coinpaprica.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@NoArgsConstructor
public class CoinPapricaCryptoCurrency implements Serializable {

    private String id;
    private String name;
    private String symbol;
    private Double rank;
    private Double circulating_supply;
    private Double total_supply;
    private Double max_supply;
    private Double beta_value;
    private String first_data_at;
    private String last_updated;
    private Double price;
    private Map<String, CoinPapricaUSDProperties> quotes;
}
