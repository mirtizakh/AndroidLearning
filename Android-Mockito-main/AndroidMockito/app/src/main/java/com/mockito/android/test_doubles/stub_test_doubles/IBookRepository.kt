package com.mockito.android.test_doubles.stub_test_doubles

interface IBookRepository {
    fun findNewBooks(days: Int): List<Book>
}