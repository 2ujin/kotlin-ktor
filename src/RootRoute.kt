package com.test.io

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.request.receive
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.post

fun Routing.root() {
    get("/"){
        call.respondText("Hello ktor", ContentType.Text.Plain)
    }
}

fun Routing.rootPost() {
    post("/"){
        val post = call.receive<String>()
        call.respondText("Reecived $post from body 어쩌구", ContentType.Text.Plain)
    }
}