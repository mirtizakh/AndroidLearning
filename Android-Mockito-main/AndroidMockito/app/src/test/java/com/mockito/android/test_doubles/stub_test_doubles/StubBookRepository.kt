package com.mockito.android.test_doubles.stub_test_doubles

import java.time.LocalDate

class StubBookRepository : IBookRepository {
    override fun findNewBooks(days: Int): List<Book> {
        val newBooks: MutableList<Book> = ArrayList()
        val book1 = Book("1234", "Mockito In Action", 500, LocalDate.now())
        val book2 = Book("1235", "JUnit 5 In Action", 400, LocalDate.now())
        newBooks.add(book1)
        newBooks.add(book2)
        return newBooks
    }

}