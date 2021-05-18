package com.project.utils.enums

enum BatchStatus {

    AVAILABLE('Available'),
    COMPLETE('Batch Complete')

    final String value

    BatchStatus(String value) {
        this.value = value
    }

    String toString() { value }

    String getKey() { name() }

}