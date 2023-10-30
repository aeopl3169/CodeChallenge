package com.shashi.shiva.codechallengevirtusa.ui.common.state

import androidx.annotation.StringRes
import com.shashi.shiva.codechallengevirtusa.R

/**
 * Error state holding values for error ui
 */
data class ErrorState(
    val hasError: Boolean = false,
    @StringRes val errorMessageStringResource: Int = R.string.empty_string
)