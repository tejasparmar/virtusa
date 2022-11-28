package com.zeller.terminalapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.zeller.terminalapp.repository.ZellerRepository
import com.zeller.terminalapp.repository.ZelllerRepositoryImpl
import com.zeller.terminalapp.transaction.TransactionViewModel
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.rules.TestRule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ZellerUnitTest {

    lateinit var  viewModel: TransactionViewModel
    lateinit var  repository: ZellerRepository
    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Before
    fun setup(){
        repository= ZelllerRepositoryImpl()
        viewModel=TransactionViewModel(repository)
        viewModel.deposit(1000f)
    }

    @Test
    fun amount_deposited() {
       assertEquals(viewModel.deposit(1000f).value,"Deposit Successfully")
    }

    @Test
    fun amount_deposited_greater_then_zero() {
        assertEquals(viewModel.deposit(0f).value,"Please Deposit Amount Greater the Zero")
    }

    @Test
    fun amount_withdraw() {
        assertEquals(viewModel.withdraw(500f).value,"Withdraw Successfully")
    }

    @Test
    fun amount_no_sufficient_balance() {
        assertEquals(viewModel.withdraw(5000f).value,"No Sufficient Balance")
    }

}