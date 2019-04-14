package web.controller

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.*

fun Routing.week() {
    get("/createNewWeek") {
        call.respondText("createNewWeek", ContentType.Text.Html)
    }

    post("/fillWeek") {
        call.respondText("fillWeek", ContentType.Text.Html)
    }

    put("/updateWeek") {
        call.respondText("updateWeek", ContentType.Text.Html)
    }

    delete("/deleteWeek") {
        call.respondText("deleteWeek", ContentType.Text.Html)
    }
}