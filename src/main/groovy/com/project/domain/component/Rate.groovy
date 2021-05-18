package com.project.domain.component


import com.project.utils.enums.FuelType
import com.project.utils.enums.Status
import grails.gorm.hibernate.annotation.ManagedEntity
import groovy.transform.CompileStatic
import org.grails.datastore.gorm.GormEntity

@CompileStatic
@ManagedEntity
class Rate implements GormEntity<Rate> {

    UUID code
    Float rate
    FuelType fuelType
    Status status

    static constraints = {
    }
}


