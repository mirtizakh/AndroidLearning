package com.mockito.android.test_doubles.Spy

import junit.framework.Assert.assertEquals

class PaymentServiceMock : IPaymentEmailSender {

    private val paymentRequestSent: MutableList<PaymentRequest> = ArrayList()
    private val expectedPaymentRequest: MutableList<PaymentRequest> = ArrayList()

    override fun send(paymentRequest: PaymentRequest) {
        paymentRequestSent.add(paymentRequest)
    }

    fun expect(paymentRequest: PaymentRequest) {
        expectedPaymentRequest.add(paymentRequest)
    }

    fun verify() {
        assertEquals(paymentRequestSent, expectedPaymentRequest)
    }

}