package com.academy.android.server.route

import com.academy.android.server.mokk.NewsMokk
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.newsRouting() {
    route("/news") {
        get {
            call.respond(NewsMokk.provideNews())
        }
    }
}

fun Application.registerNewsRoutes() {
    routing {
        newsRouting()
    }
}
