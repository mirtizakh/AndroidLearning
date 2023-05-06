package com.mockito.android.test_doubles.Spy

class OperatorRateStub(var rate: Int):IOperatorRate {

    override fun feeRate(operator: String): Int {
        return rate
    }
}