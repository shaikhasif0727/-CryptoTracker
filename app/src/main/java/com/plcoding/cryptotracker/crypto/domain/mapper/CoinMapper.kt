package com.plcoding.cryptotracker.crypto.domain.mapper

import com.plcoding.cryptotracker.crypto.data.dto.CoinDto
import com.plcoding.cryptotracker.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercentage24Hr
    )
}