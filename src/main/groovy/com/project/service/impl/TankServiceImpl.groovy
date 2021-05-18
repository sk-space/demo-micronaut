package com.project.service.impl

import com.project.domain.component.Tank
import com.project.repository.TankRepository
import com.project.service.TankService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic

import javax.inject.Singleton
import javax.validation.constraints.NotNull

@CompileStatic
@Singleton
@Transactional
class TankServiceImpl implements TankService{

    private final TankRepository tankRepository

    TankServiceImpl(TankRepository tankRepository) {
        this.tankRepository = tankRepository
    }

    @Override
    int count() {
        return tankRepository.count()
    }

    @Override
    List<Tank> findAll() {
        return tankRepository.findAll().toList()
    }

    @Override
    List<Tank> findAll(Map args) {
        return null
    }

    @Override
    Tank find(@NotNull Long id) {
        return tankRepository.findById(id).get()
    }

    @Override
    Tank save(Tank tank) {
        return tankRepository.save(tank)
    }

    @Override
    Tank delete(@NotNull Long id) {
        return tankRepository.delete(find(id))
    }
}
