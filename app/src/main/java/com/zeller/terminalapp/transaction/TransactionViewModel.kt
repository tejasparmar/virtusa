package com.zeller.terminalapp.transaction

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zeller.terminalapp.dto.Transaction
import com.zeller.terminalapp.repository.ZellerRepository
import com.zeller.terminalapp.repository.ZelllerRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TransactionViewModel @Inject constructor(private val zellerRepository: ZellerRepository) :
    ViewModel() {

    fun deposit(amount: Float): MutableLiveData<String> {
        val liveData: MutableLiveData<String> = MutableLiveData()
        val transaction = Transaction(amount, true, "Deposit")
        val result = zellerRepository.deposit(transaction = transaction)
        liveData.value = result
        return liveData
    }

    fun withdraw(amount: Float): MutableLiveData<String> {
        val liveData: MutableLiveData<String> = MutableLiveData()
        val transaction = Transaction(amount, false, "Withdraw")
        val result = zellerRepository.withdraw(transaction = transaction)
        liveData.value = result
        return liveData
    }

    fun getTransactionList(): List<Transaction> {
        return zellerRepository.getTransactionList()
    }

    fun getBalance(): Float {
        return zellerRepository.getBalance()
    }
}