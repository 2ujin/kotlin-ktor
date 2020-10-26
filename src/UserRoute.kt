package com.test.io

import io.ktor.routing.Routing
import io.ktor.routing.get

fun Routing.users(){
    get("/users"){
    }
}