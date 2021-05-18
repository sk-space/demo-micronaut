package com.project.controller
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.RxHttpClient
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Test
import io.micronaut.http.client.annotation.*
import javax.inject.Inject
import static org.junit.jupiter.api.Assertions.*

@MicronautTest
public class TankControllerTest {

    @Inject
    @Client("/")
    RxHttpClient client

    @Test
    void testIndex() throws Exception {
        assert client.toBlocking().exchange("/tank").status() == HttpStatus.OK
    }
}
