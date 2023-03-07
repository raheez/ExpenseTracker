package com.example.expensetracker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.expensetracker.data.Transactions
import com.example.expensetracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mBinding: ActivityMainBinding
    lateinit var mAdapter: TransactionsAdapter
    lateinit var mList: ArrayList<Transactions>
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.buttonAdd.setOnClickListener {
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
        }
        mList = ArrayList<Transactions>()
        setAdapter()
    }

    private fun setAdapter() {

        viewModel?.mLiveData?.observe(this, Observer {
            if (it.isNotEmpty()) {
                mList.addAll(it)
                mAdapter = TransactionsAdapter(mList, this)
                mBinding?.recyclerView?.layoutManager = LinearLayoutManager(this)
                mBinding?.recyclerView?.adapter = mAdapter

            }
        })

    }
}