package com.mockito.android.test_doubles.Spy

class PaymentEmailSpy : IPaymentEmailSender {
    private val paymentRequests: MutableList<PaymentRequest> = ArrayList()

    override fun send(paymentRequest: PaymentRequest) {
        paymentRequests.add(paymentRequest)
    }

    fun timesCalled(): Int {
        return paymentRequests.size
    }

    fun calledWith(paymentRequest: PaymentRequest): Boolean {
        return paymentRequests.contains(paymentRequest)
    }
}