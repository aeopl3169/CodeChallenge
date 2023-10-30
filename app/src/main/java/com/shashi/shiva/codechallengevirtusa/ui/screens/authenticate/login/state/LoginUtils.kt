package com.shashi.shiva.codechallengevirtusa.ui.screens.authenticate.login.state

import com.shashi.shiva.codechallengevirtusa.R
import com.shashi.shiva.codechallengevirtusa.ui.common.state.ErrorState

val emailOrMobileEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_email_mobile
)

val passwordEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_password
)