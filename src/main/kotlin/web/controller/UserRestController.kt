package web.controller

import dao.DBConnector.DatabaseFactory
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.post
import services.UserService

fun Routing.user() {
    val userService = UserService()


    post("/createUser") {
        call.respondText("createUser", ContentType.Text.Html)
    }

    get("/getUserProfile") {
        call.respond(userService.getAllUsers())
    }

    get("/UserTimeSheetList") {
        call.respondText("UserTimeSheetList", ContentType.Text.Html)
    }
}