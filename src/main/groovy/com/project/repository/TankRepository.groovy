package com.project.repository

import com.project.domain.component.Tank
import grails.gorm.transactions.Transactional
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Transactional
interface TankRepository extends CrudRepository<Tank, Long> {

}