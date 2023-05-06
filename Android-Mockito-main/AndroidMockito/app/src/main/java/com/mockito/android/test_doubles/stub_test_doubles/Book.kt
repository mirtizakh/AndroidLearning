package com.mockito.android.test_doubles.stub_test_doubles

import java.time.LocalDate

data class Book(
    var bookId: String,
    var title: String,
    var price: Int,
    var publishedDate: LocalDate
)