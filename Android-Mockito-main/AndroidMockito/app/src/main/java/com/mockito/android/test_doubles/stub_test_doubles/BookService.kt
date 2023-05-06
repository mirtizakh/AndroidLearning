package com.mockito.android.test_doubles.stub_test_doubles

class BookService(var bookRepository: IBookRepository) {

    fun getNewBooksWithAppliedDiscount(discountRate: Int, days: Int): List<Book>? {
        val newBooks: List<Book> = bookRepository.findNewBooks(days)
        // 500 apply 10% -> 10% of 500 -> 50 -> 500 - 50 -> 450
        for (book in newBooks) {
            val price = book.price
            val newPrice = price - discountRate * price / 100
            book.price = newPrice
        }
        return newBooks
    }
}