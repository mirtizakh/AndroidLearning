package com.mockito.android.test_doubles.dummy_test_doubles

interface IBookRepository {

    fun saveBook(book: Book)

    fun findAll(): Collection<Book>
}