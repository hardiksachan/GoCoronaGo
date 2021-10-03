package com.example.gocoronago.tipspage.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.gocoronago.tipspage.model.Tip
import com.example.gocoronago.tipspage.model.tipList
import com.example.gocoronago.ui.theme.AppTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

@ExperimentalPagerApi
@Composable
fun TipsViewPager(
    tips: List<Tip>
) {
    HorizontalPager(count = tips.size) { index ->
        val tip = tips[index]
        Text(
            text = stringResource(id = tip.stringRes),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

// todo: figure out why previews are not working!!
@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun TipsViewPagerPreview() {
    AppTheme {
        TipsViewPager(tips = tipList)
    }
}