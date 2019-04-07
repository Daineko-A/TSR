package web.controller

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.*


fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        get("/") {
            call.respondText("Hello World!", ContentType.Text.Html)
        }

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