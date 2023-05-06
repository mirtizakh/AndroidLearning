package com.mockito.android.test_doubles.fake_test_doubles

import java.time.LocalDate

data class Book(
    val bookId: String,
    val title: String,
    val price: Int,
    val publishedDate: LocalDate
)