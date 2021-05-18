package com.project.domain.component


import grails.gorm.hibernate.annotation.ManagedEntity
import groovy.transform.CompileStatic
import org.grails.datastore.gorm.GormEntity

@CompileStatic
@ManagedEntity
class Sort implements GormEntity<Sort> {

    UUID sortCode
    Double sort

    static constraints = {

    }
}
