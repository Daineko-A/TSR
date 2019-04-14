package web.controller

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.post

fun Routing.user() {
    post("/createUser") {
        call.respondText("createUser", ContentType.Text.Html)
    }

    get("/getUserProfile") {
        call.respondText("getUserProfile", ContentType.Text.Html)
    }

    get("/UserTimeSheetList") {
        call.respondText("UserTimeSheetList", ContentType.Text.Html)
    }
}