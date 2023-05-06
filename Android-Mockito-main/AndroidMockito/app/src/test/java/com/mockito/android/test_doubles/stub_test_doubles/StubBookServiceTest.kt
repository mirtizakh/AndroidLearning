package com.mockito.android.test_doubles.stub_test_doubles

import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import java.time.LocalDate


class StubBookServiceTest {
    @Test
    fun test_StubTestDouble() {
        val bookRepository = StubBookRepository()
        val bookService = BookService(bookRepository)
        val newBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10, 7)
        assertEquals(2, newBooksWithAppliedDiscount!!.size)
        assertEquals(450, newBooksWithAppliedDiscount[0].price)
        assertEquals(360, newBooksWithAppliedDiscount[1].price)
    }

    @Test
    fun test_StubWithMockito() {
        val bookRepository: IBookRepository = mock(IBookRepository::class.java)
        val bookService = BookService(bookRepository)
        val book1 = Book("1234", "Mockito In Action", 500, LocalDate.now())
        val book2 = Book("1235", "JUnit 5 In Action", 400, LocalDate.now())
        val newBooks: MutableList<Book> = ArrayList()
        newBooks.add(book1)
        newBooks.add(book2)
        `when`(bookRepository.findNewBooks(7)).thenReturn(newBooks)
        val newBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10, 7)
        assertEquals(2, newBooksWithAppliedDiscount!!.size)
        assertEquals(450, newBooksWithAppliedDiscount[0].price)
        assertEquals(360, newBooksWithAppliedDiscount[1].price)
    }
}