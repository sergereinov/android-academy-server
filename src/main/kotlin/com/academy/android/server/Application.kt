package com.academy.android.server

import com.academy.android.server.route.registerNewsRoutes
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*

/*
    hlp urls

    HTTP APIs quickstart https://ktor.io/docs/creating-http-apis.html
    exposed + postgres https://stefangaller.at/app-development/kotlin/ktor-rest-api-exposed/

    hackathon-22-backend reference https://github.com/mik629/hackathon-22-backend
    AndroidAcademyClient https://github.com/Android-Academy-Global/AndroidAcademyClient

    Running the application from inside the IDE
    https://ktor.io/docs/running.html#running-the-application-from-inside-the-ide
 */

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("UNUSED_PARAMETER")
fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        json()
    }
    
    registerNewsRoutes()

    routing {
        get("/") {
            call.respondText("Hello, root!")
        }
    }
}
