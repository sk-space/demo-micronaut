package com.project

import com.project.domain.component.Tank
import com.project.service.TankService
import com.project.utils.enums.FuelType
import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.event.annotation.EventListener

import javax.inject.Singleton

@Singleton
class Bootstrap {

    final TankService tankService

    Bootstrap(TankService personService) {
        this.tankService = personService
    }

    @EventListener
    void onStartup(StartupEvent event) {
        tankService.save(new Tank(name: 'hell', totalCapacity: 25, fuelType: FuelType.MS, code: UUID.randomUUID()))
    }

}
