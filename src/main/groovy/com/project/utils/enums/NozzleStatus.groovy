package com.project.utils.enums

enum NozzleStatus {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE")

    final String values

    NozzleStatus(String value) {
        this.value = value
    }

    String toString() { value }

    String getKey() { name() }
}