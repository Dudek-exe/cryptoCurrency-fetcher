package com.cryptoccyfethcer.cryptocurrencyfetcher.external.coinpaprica.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CoinPapricaUSDProperties implements Serializable {

    private Double price;
    private Double volume_24h;
    private Double volume_24h_change_24h;
    private Double market_cap;
    private Double market_cap_change_24h;
    private Double percent_change_15m;
    private Double percent_change_30m;
    private Double percent_change_1h;
    private Double percent_change_6h;
    private Double percent_change_12h;
    private Double percent_change_24h;
    private Double percent_change_7d;
    private Double percent_change_30d;
    private Double percent_change_1y;
    private Double ath_price;
    private String ath_date;
    private Double percent_from_price_ath;

}
