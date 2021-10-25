package com.cryptoccyfethcer.cryptocurrencyfetcher.external.coinpaprica.impl;

import com.cryptoccyfethcer.cryptocurrencyfetcher.external.coinpaprica.CoinPapricaApiConnector;
import com.cryptoccyfethcer.cryptocurrencyfetcher.external.coinpaprica.CoinPapricaApiConstants;
import com.cryptoccyfethcer.cryptocurrencyfetcher.external.coinpaprica.dto.CoinPapricaCryptoCurrency;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class CoinPapricaApiConnectorImpl implements CoinPapricaApiConnector {

    private final RestTemplate restTemplate;

    @Override
    public void getNewestCryptoCcyList() {
        CoinPapricaCryptoCurrency[] currencyArrayFromApi = restTemplate
                .getForObject(CoinPapricaApiConstants.COIN_PAPRICA_URL, CoinPapricaCryptoCurrency[].class);

        if (currencyArrayFromApi != null){

        }

    }


}
