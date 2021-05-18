package com.project.utils.enums

enum CustomerType {

    INDIVIDUAL('INDIVIDUAL'),
    COMPANY('COMPANY'),
    REGISTERED('REGISTERED'),
    UNREGISTERED('UNREGISTERED')

    final String value

    CustomerType(String value) {
        this.value = value
    }

    String toString() { value }

    String getKey() { name() }

}