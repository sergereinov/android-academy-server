package com.academy.android.server.route

import com.academy.android.server.mokk.VideoMokk
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.videoRouting() {
    route("/video") {
        get {
            call.respond(VideoMokk.provideVideos())
        }
    }
}

fun Application.registerVideoRoutes() {
    routing {
        videoRouting()
    }
}
