package web.controller

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.routing.*

fun Application.week() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        get("/createNewWeek") {

        }

        post("/fillWeek") {

        }

        put("/updateWeek") {

        }

        delete("/deleteWeek") {

        }
    }
}