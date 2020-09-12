package com.example.mvvm_example_live_data.data

data class Quote(val quoteText: String, val author: String) {

    override fun toString(): String
    {
        return "$quoteText - $author"
    }

}