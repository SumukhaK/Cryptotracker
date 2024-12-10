package com.plcoding.cryptotracker.crypto.presentation.coin_detail

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun LineChart(
    dataPoints: List<Datapoint>,
    style: ChartStyle,
    visibleDataPointsIndices: IntRange,
    unit: String,
    modifier: Modifier = Modifier,
    selectedDatapoint: Datapoint? = null,
    onSelectedDatapoint: (Datapoint) -> Unit = {},
    onXLabelWidthChange: (Float) -> Unit = {},
    showHelperLines: Boolean = true
){

}