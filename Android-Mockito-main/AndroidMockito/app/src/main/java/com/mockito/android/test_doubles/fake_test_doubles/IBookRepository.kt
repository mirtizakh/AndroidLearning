package com.mockito.android.test_doubles.fake_test_doubles

interface IBookRepository {

    fun saveBook(book: Book)

    fun findAll(): Collection<Book>
}