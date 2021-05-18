package com.project

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
        info = @Info(
                title = "fuel",
                version = "0.0"
        )
)
@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.build(args)
                .packages("com.project.domain", "com.project.domain.auth", "com.project.domain.component")
                .mainClass(Application.class)
                .start()
    }
}
