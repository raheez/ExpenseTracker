package com.example.expensetracker.data

import com.example.expensetracker.domain.Repository

class RepositoryImpl:Repository {
    override fun mGetAllTransactions() = listOf(
        Transactions("food","100","1","tag_1","","",System.currentTimeMillis(),1),
        Transactions("food","200","1","tag_1","","",System.currentTimeMillis(),1),
        Transactions("food","300","1","tag_1","","",System.currentTimeMillis(),1),
        Transactions("food","200","1","tag_1","","",System.currentTimeMillis(),1),
        Transactions("food","300","1","tag_1","","",System.currentTimeMillis(),1),
        Transactions("food","200","1","tag_1","","",System.currentTimeMillis(),1),
    )
}