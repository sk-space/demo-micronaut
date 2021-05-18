package com.project.utils.enums

enum PaymentType {

    CASH('Cash'),
    CHEQUE('Cheque'),
    CASH_CHEQUE('Cash And Cheque'),
    CREDIT('Credit'),
    CASH_CREDIT('Cash And Credit'),
    CHEQUE_CREDIT('Cheque And Credit'),
    CASH_CHEQUE_CREDIT('Cash, Cheque And Credit')

    final String value

    PaymentType(String value) {
        this.value = value
    }

    String toString() { value }

    String getKey() { name() }

}