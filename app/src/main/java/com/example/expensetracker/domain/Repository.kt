package com.example.expensetracker.domain

import com.example.expensetracker.data.Transactions

interface Repository  {
    fun mGetAllTransactions():List<Transactions>
}