package com.cryptoccyfethcer.cryptocurrencyfetcher.api.coinpaprica;

import com.cryptoccyfethcer.cryptocurrencyfetcher.api.coinpaprica.dto.CryptoCurrencyResponse;
import com.cryptoccyfethcer.cryptocurrencyfetcher.domain.coinpaprica.CoinPapricaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "cryptoCurrency")
public class CoinPapricaController {

    private final CoinPapricaService coinPapricaService;



}
