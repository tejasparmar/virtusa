package com.zeller.terminalapp.repository
import com.zeller.terminalapp.dto.Transaction

class ZelllerRepositoryImpl : ZellerRepository {
    private var balance: Float = 0f
    private val transactionsList: MutableList<Transaction> = mutableListOf()

    override fun deposit(transaction: Transaction): String {
        val result: String
        if (transaction.amount > 0) {
            balance += transaction.amount
            transactionsList.add(transaction)
            result = "Deposit Successfully"
        } else {
            result = "Please Deposit Amount Greater the Zero"
        }
        return result
    }

    override fun withdraw(transaction: Transaction): String {
        val result: String
        if (balance >= transaction.amount) {
            balance -= transaction.amount
            transactionsList.add(transaction)
            result = "Withdraw Successfully"
        } else {
            result = "No Sufficient Balance"
        }

        return result
    }

    override fun getTransactionList(): List<Transaction> {
        return transactionsList
    }

    override fun getBalance(): Float {
        return balance
    }

}