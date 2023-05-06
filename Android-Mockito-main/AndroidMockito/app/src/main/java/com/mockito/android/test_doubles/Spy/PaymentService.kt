package com.mockito.android.test_doubles.Spy


class PaymentService(
    var logger: ILogger,
    var operatorRate: IOperatorRate,
    var emailSender: IPaymentEmailSender
) {

    fun createPaymentRequest(saleTotal: Int, customerName: String): PaymentRequest? {
        logger.append("Creating payment for sale: $saleTotal")
        val feeRate = operatorRate.feeRate(customerName)
        val fee: Int = feeRate * saleTotal / 100
        val paymentRequest = PaymentRequest(saleTotal, customerName, fee)
        if (saleTotal >= 1000) {
            emailSender.send(paymentRequest)
        }
        return paymentRequest
    }
}