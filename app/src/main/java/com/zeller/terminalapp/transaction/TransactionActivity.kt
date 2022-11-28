package com.zeller.terminalapp.transaction

import android.os.Bundle
import com.zeller.terminalapp.base.BaseActivity
import com.zeller.terminalapp.databinding.ActivityTransactionBinding
import com.zeller.terminalapp.transactionlist.TransactionListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TransactionActivity : BaseActivity(),TransactionFragment.ShowTransactionList {

    private lateinit var binding: ActivityTransactionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransactionBinding.inflate(layoutInflater)
        if (savedInstanceState == null) {
            init()
        }
        setContentView(binding.root)
    }

    override fun init() {
        val transactionFragment = TransactionFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(binding.frameLayout.id, transactionFragment).commit()
    }

    override fun onShow() {
        val transactionListFragment = TransactionListFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(binding.frameLayout.id, transactionListFragment).commit()
    }

}