package com.project.utils.enums

enum MunicipalityType{
    METROPOLITAN("METROPOLITAN"),
    SUB_METROPOLITAN("SUB-METROPOLITAN"),
    MUNICIPALITY("MUNICIPALITY"),
    RURAL_MUNICIPALITY("RURAL MUNICIPALITY")

    final String value

    MunicipalityType(String value){
        this.value = value
    }

    String toString() { value }
    String getKey() { name() }
}