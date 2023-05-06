package com.mockito.android.test_doubles.Spy

import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*
import org.mockito.kotlin.verify

class PaymentServiceTest {
    private lateinit var operatorRate: IOperatorRate
    private lateinit var emailSender: PaymentEmailSpy
    private lateinit var paymentService: PaymentService
    private lateinit var loggerDummy: ILogger
    private val customerName = "Bob"

    @Before
    fun setUp() {
        loggerDummy = LoggerDummy()
        operatorRate = OperatorRateStub(10)
        emailSender = PaymentEmailSpy()
        paymentService = PaymentService(loggerDummy, operatorRate, emailSender)
    }


    @Test
    fun test_notSendEmailForSalesUnder1000() {
        val spiedPaymentService = PaymentService(loggerDummy, operatorRate, emailSender)
        spiedPaymentService.createPaymentRequest(500, customerName)
        assertEquals(0, emailSender.timesCalled())
    }

    @Test
    fun test_notSendEmailForSalesUnder1000_withMockito() {
       // val mockEmailSender = mock(IPaymentEmailSender::class.java)
        val mockEmailSender = mockk<IPaymentEmailSender>()
        val mockPaymentRequest = mockk<PaymentRequest>()
        val spiedPaymentService = PaymentService(loggerDummy, operatorRate, mockEmailSender)
        val paymentRequest = spiedPaymentService.createPaymentRequest(1500, customerName)
        paymentRequest?.let { request->
           // verify(mockEmailSender, times(1)).send(mockPaymentRequest)
            verify(exactly = 0) { mockEmailSender.send(mockPaymentRequest) }
        }
    }
}