package com.zeller.terminalapp.transaction

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.zeller.terminalapp.R
import com.zeller.terminalapp.base.BaseFragment
import com.zeller.terminalapp.databinding.FragmentTransactionBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TransactionFragment : BaseFragment(), View.OnClickListener {

    private lateinit var binding: FragmentTransactionBinding
    private val viewModel: TransactionViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentTransactionBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    override fun init() {
        binding.withdrawButton.setOnClickListener(this)
        binding.depositButton.setOnClickListener(this)
        binding.transactionListButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.withdrawButton) {
            if (!binding.amountInput.text.isNullOrEmpty()) {
                val amt = binding.amountInput.text.toString().toFloat()
                viewModel.withdraw(amt).observe(this) {
                    Toast.makeText(requireContext(), it, Toast.LENGTH_LONG).show()
                }
                binding.balance.text = viewModel.getBalance().toString()
                binding.amountInput.text!!.clear()
            }
        }
        if (view?.id == R.id.depositButton) {
            if (!binding.amountInput.text.isNullOrEmpty()) {
                val amt = binding.amountInput.text.toString().toFloat()
                viewModel.deposit(amt).observe(this) {
                    Toast.makeText(requireContext(), it, Toast.LENGTH_LONG).show()
                }
                binding.balance.text = viewModel.getBalance().toString()
                binding.amountInput.text!!.clear()
            }
        }
        if (view?.id == R.id.transactionListButton) {
            val transactionActivity: TransactionActivity = activity as TransactionActivity
            transactionActivity.onShow()
        }
    }

    interface ShowTransactionList {
        fun onShow()
    }

}