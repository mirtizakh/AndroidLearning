package com.mockito.android.test_doubles.dummy_test_doubles

class BookService(var bookRepository: IBookRepository, var emailService: IEmailService) {

    fun addBook(book: Book) {
        bookRepository.saveBook(book)
    }

    fun findNumberOfBooks() = bookRepository.findAll().size

    // We have some other methods i future for email sending
}