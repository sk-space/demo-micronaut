package com.project.utils.enums

enum AddressType {
    P("PERMANENT"),
    T("TEMPORARY"),
    B("BOTH")

    final String value

    AddressType(String value) {
        this.value = value
    }

    String toString() { value }

    String getKey() { name() }
}