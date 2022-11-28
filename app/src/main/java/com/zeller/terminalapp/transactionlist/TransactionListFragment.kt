package com.zeller.terminalapp.transactionlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.zeller.terminalapp.base.BaseFragment
import com.zeller.terminalapp.databinding.FragmentTransactionListBinding
import com.zeller.terminalapp.transaction.TransactionViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TransactionListFragment : BaseFragment() {

    private lateinit var binding: FragmentTransactionListBinding
    private val viewModel: TransactionViewModel by activityViewModels()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentTransactionListBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    override fun init() {
        val adapter = TransactionListAdapter(viewModel.getTransactionList())
        binding.rvTransactionList.layoutManager = LinearLayoutManager(context)
        binding.rvTransactionList.adapter = adapter
    }
}