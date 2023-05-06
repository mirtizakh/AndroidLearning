package com.mockito.android.test_doubles.fake_test_doubles


import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock


class FakeBookServiceTest {

    // region unit test
    @Test
    fun test_FakeTestDouble() {
        val bookRepository = FakeBookRepository()
        val bookService = BookService(bookRepository)

        bookService.addBook(Book("1234", "Mockito In Action", 250, LocalDate.now()))
        bookService.addBook(Book("1235", "JUnit 5 In Action", 200, LocalDate.now()))

        assertEquals(2, bookService.findNumberOfBooks())
    }

    @Test
    fun test_FakeWithMockito() {
        val bookRepository: IBookRepository = mock(IBookRepository::class.java)
        val bookService = BookService(bookRepository)
        val book1 = Book("1234", "Mockito In Action", 250, LocalDate.now())
        val book2 = Book("1235", "JUnit 5 In Action", 200, LocalDate.now())
        val books: MutableCollection<Book> = ArrayList()
        books.add(book1)
        books.add(book2)
        `when`(bookRepository.findAll()).thenReturn(books)
        assertEquals(2, bookService.findNumberOfBooks())
    }
}