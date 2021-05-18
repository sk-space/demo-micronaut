package com.project.utils.enums

enum OrganizationType {

    FUEL('Fuel Station'),
    HARDWARE('Hardware Store')

    final String value

    OrganizationType(String value) {
        this.value = value
    }

    String toString() { value }

    String getKey() { name() }

}