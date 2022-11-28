package com.zeller.terminalapp.dto

data class Transaction(val amount: Float, val isDeposit: Boolean, val status: String)