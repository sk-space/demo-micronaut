package com.project.utils.enums

enum FuelType {
    MS("petrol"),
    HSD("diesel")

    final String value

    FuelType(String value) {
        this.value = value
    }

    String toString() { value }

    String getKey() { name() }
}