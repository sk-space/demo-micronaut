package com.project.controller

import com.project.domain.component.Tank
import com.project.service.TankService
import groovy.util.logging.Slf4j
import io.micronaut.core.version.annotation.Version
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.hateoas.JsonError
import io.reactivex.Single

@Slf4j
@Controller("/tanks")
class TankController {

    protected final TankService tankService

    TankController(TankService tankService) {
        this.tankService = tankService
    }

    @Version("v1")
    @Get(uri = "/", produces = "text/json")
    List<Tank> index() {
        log.info("inside index v1")
        return tankService.findAll()
    }

    @Version("v2")
    @Get("/")
    Single<HttpResponse<?>> list() {
        Single.just(tankService.findAll()).map({ result ->
            HttpResponse.ok(result)
        }).onErrorReturn({ throwable ->
            new JsonError(throwable.message)
        })
    }
}