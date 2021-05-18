package com.project.utils.enums

enum Unit {
    KG('Kg.'),
    LTR('Ltr.'),
    SQM('Sqm.'),
    DOZEN('Dozen'),
    UNIT('Unit')

    final String value

    Unit(String value) {
        this.value = value
    }

    String toString() { value }

    String getKey() { name() }

}