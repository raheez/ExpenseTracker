package com.example.expensetracker.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.expensetracker.data.RepositoryImpl
import com.example.expensetracker.data.Transactions

class HomeViewModel:ViewModel() {

    var mList = MutableLiveData<List<Transactions>>()
    val mLiveData : LiveData<List<Transactions>> = mList

    var mRepository = RepositoryImpl()
    init {
        mList.value = mRepository.mGetAllTransactions()
    }
}