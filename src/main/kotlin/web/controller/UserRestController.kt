package web.controller

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.post


fun Application.user() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        post("/createUser") {

        }

        get("/getUserProfile") {

        }

        get("/UserTimeSheetList") {

        }
    }
}