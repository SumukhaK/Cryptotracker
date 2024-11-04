package com.plcoding.cryptotracker.crypto.presentation.coin_list

sealed interface CoinListAction {
data class OnCoinClick(val coinUi: CoinUi) : CoinListAction
    data object OnRefresh: CoinListAction
}