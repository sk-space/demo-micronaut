package com.project.utils.enums

enum PaymentOption {

    CASH('Cash'),
    CREDIT('Credit'),
    CHEQUE('Cheque/Bank'),
    DRAFT('Bank Draft'),
    LC('Letter Of Credit')

    final String value

    PaymentOption(String value) {
        this.value = value
    }

    String toString() { value }

    String getKey() { name() }


}