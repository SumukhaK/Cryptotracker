package com.plcoding.cryptotracker.crypto.presentation.coin_list

import android.icu.text.NumberFormat
import androidx.annotation.DrawableRes
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.core.presentation.utils.getDrawableIdForCoin
import java.util.Locale

data class CoinUi(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: DisplayableNumber,
    val priceUSD : DisplayableNumber,
    val changePercentIn24Hr: DisplayableNumber,
    @DrawableRes val iconRes : Int
)


data class DisplayableNumber(
    val value: Double,
    val formattedString: String
)

fun Coin.toCoinUi(): CoinUi {
    return CoinUi(
        id = id,
        name = name,
        symbol = symbol,
        rank = rank,
        priceUSD = priceUsd.toDisplayableNumber(),
        marketCapUsd = marketCapUsd.toDisplayableNumber(),
        changePercentIn24Hr = changePercent24Hr.toDisplayableNumber(),
        iconRes = getDrawableIdForCoin(symbol = symbol)
    )
}

fun Double.toDisplayableNumber(): DisplayableNumber {

    val formatter = NumberFormat.getNumberInstance(Locale.getDefault()).apply {
        minimumFractionDigits = 2
        maximumFractionDigits = 2
    }

    return DisplayableNumber(value = this,
        formattedString = formatter.format(this))
}
