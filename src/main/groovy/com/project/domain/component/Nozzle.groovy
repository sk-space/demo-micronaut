package com.project.domain.component


import com.project.utils.enums.Status
import grails.gorm.hibernate.annotation.ManagedEntity
import groovy.transform.CompileStatic
import org.grails.datastore.gorm.GormEntity

@CompileStatic
@ManagedEntity
class Nozzle implements GormEntity<Nozzle> {

    UUID code
    String name
    Status status

    static belongsTo = [tank: Tank]

    static constraints = {

    }

}
