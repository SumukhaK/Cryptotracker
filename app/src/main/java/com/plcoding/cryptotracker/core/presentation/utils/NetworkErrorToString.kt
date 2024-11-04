package com.plcoding.cryptotracker.core.presentation.utils

import android.content.Context
import com.plcoding.cryptotracker.R
import com.plcoding.cryptotracker.core.domain.util.NetworkError

fun NetworkError.toStringText(context: Context): String {
    val resId = when(this){
        NetworkError.REQUEST_TIMEOUT -> R.string.error_request_timeout
        NetworkError.TOO_MANY_REQUESTS -> R.string.error_too_many_requests
        NetworkError.NO_INTERNET -> R.string.error_no_internet
        NetworkError.SERVER_ERROR -> R.string.error_something_went_wrong
        NetworkError.SERIALIZATION_ERROR -> R.string.error_serialization
        NetworkError.UNKONWN_ERROR -> R.string.error_something_went_wrong
    }
    return context.getString(resId)
}