package com.project.utils.enums

enum Status {
    PENDING('PENDING'),
    VERIFIED('VERIFIED'),
    AUTHORIZED('AUTHORIZED'),
    APPROVED('APPROVED'),
    REJECTED('REJECTED'),
    ACTIVE('ACTIVE'),
    INACTIVE('INACTIVE')

    final String value

    Status(String value) {
        this.value = value
    }

    String toString() { value }

    String getKey() { name() }
}