package com.mockito.android.test_doubles.stub_test_doubles.example_with_repository

import com.mockito.android.test_doubles.stub_test_doubles.Book

interface IUpdatedBookRepository {

    fun saveBook(book: Book)

    fun findAll(): Collection<Book>
}


/*
class FakeBookRepository : IUpdatedBookRepository {

    override fun saveBook(book: Book) {
        //Do nothing
    }

    override fun findAll(): Collection<Book> {
        return List<Book>();
    }
}

 */