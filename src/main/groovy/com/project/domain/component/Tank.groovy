package com.project.domain.component

import com.project.utils.enums.FuelType
import grails.gorm.annotation.Entity
import grails.gorm.hibernate.annotation.ManagedEntity
import groovy.transform.CompileStatic
import org.grails.datastore.gorm.GormEntity

@CompileStatic
@Entity
class Tank implements GormEntity<Tank> {

    UUID code
    String name
    FuelType fuelType
    Double totalCapacity

    static hasMany = [nozzels: Nozzle]

    static fetchMode = [nozzels: 'lazy']

    static constraints = {

    }
}



