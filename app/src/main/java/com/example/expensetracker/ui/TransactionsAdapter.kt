package com.example.expensetracker.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expensetracker.data.Transactions
import com.example.expensetracker.databinding.AdapterTransactionListItemBinding

class TransactionsAdapter(list: ArrayList<Transactions>,context : Context) : RecyclerView.Adapter<TransactionsAdapter.TransactionViewHolder>() {

    var mList = list
    var mContext = context

    class TransactionViewHolder(val binding: AdapterTransactionListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        var mView = AdapterTransactionListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TransactionViewHolder(mView)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {

        mList?.get(position)?.let {
            holder.binding.title.text = it.title
            holder.binding.amount.text = it.amount
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

}