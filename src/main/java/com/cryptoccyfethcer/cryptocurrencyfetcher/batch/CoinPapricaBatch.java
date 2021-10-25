package com.cryptoccyfethcer.cryptocurrencyfetcher.batch;

import com.cryptoccyfethcer.cryptocurrencyfetcher.external.coinpaprica.CoinPapricaApiConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@EnableScheduling
@RequiredArgsConstructor
@Service
public class CoinPapricaBatch {

    private final CoinPapricaApiConnector coinPapricaApiConnector;

    @Scheduled(fixedDelay = 1000)
    public void getNewestRates(){
        coinPapricaApiConnector.getNewestCryptoCcyList();
    }

}
