package com.project.service

import com.project.domain.component.Tank
import grails.gorm.services.Service
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic

import javax.validation.constraints.NotNull

@CompileStatic
@Service(Tank)
interface TankService {

    abstract int count()

    abstract List<Tank> findAll()

    abstract List<Tank> findAll(Map args)

    abstract Tank find(@NotNull Long id)

    abstract Tank save(Tank tank)

    abstract Tank delete(@NotNull Long id)

}