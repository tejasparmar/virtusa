package com.zeller.terminalapp.repository

import androidx.lifecycle.MutableLiveData
import com.zeller.terminalapp.dto.Transaction

interface ZellerRepository {
    fun deposit(transaction: Transaction) : String
    fun withdraw(transaction: Transaction) : String
    fun getTransactionList():List<Transaction>
    fun getBalance():Float
}