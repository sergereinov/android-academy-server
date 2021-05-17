package com.academy.android.server.route

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.newsRouting() {
    route("/news") {
        get {
            call.respondText("Hello, news!")
        }
    }
}

fun Application.registerNewsRoutes() {
    routing {
        newsRouting()
    }
}
