package com.shashi.shiva.codechallengevirtusa.ui.screens.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.shashi.shiva.codechallengevirtusa.R
import com.shashi.shiva.codechallengevirtusa.ui.common.customview.TitleText
import com.shashi.shiva.codechallengevirtusa.ui.theme.CodeChallengeTheme

@Composable
fun DashboardScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TitleText(text = stringResource(id = R.string.dashboard_title_welcome_user))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDashboardScreen() {
    CodeChallengeTheme {
        DashboardScreen()
    }
}