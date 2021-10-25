package com.cryptoccyfethcer.cryptocurrencyfetcher.domain.coinpaprica;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class CoinPapricaDBEntity {

    @Id
    @Column(name = "currency_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "rate")
    private String rate;

    @Column(name = "code", unique = true)
    private String code;

}
