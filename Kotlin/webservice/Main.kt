package com.coding.oc


import com.coding.oc.Course.Companion.newInstance
import com.google.gson.Gson
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    val courses = loadData()
    val server = embeddedServer(Netty, port = 8080) {
        routing {
            get("/") {
                call.respondText("Welcome to OpenClassrooms brand new server !", ContentType.Text.Plain)
            }
            get("/course/top") {
                //affichez le premier cours.
                call.respondText(convertToJson(courses.first()))
            }

            get("/course/{id}"){
                val id = call.parameters["id"]!!.toInt()
                var result=when(id){
                         in 1..3 ->(courses.filter { it.identifier==id }.first())
                         else->throw Exception("$id is not in the range 1..3")
                        }
                call.respondText(
                    convertToJson(result)
                )
            }
        }
    }
    server.start(wait = true)
}

fun loadData():List<Course>{
    val english = Course(1,"Initiez-vous à Kotlin",Level.EASY,true)
    val roman = Course(2,"Dynamisez vos site web avec Javadscript",Level.MIDDLE,true)
    val frenchRevolution = newInstance(3,"Optimisez votre architecture Microservices",Level.HARD,true)
    return listOf<Course>(english,roman,frenchRevolution)
}

fun convertToJson(course:Course):String{
    val gson = Gson()
    return gson.toJson(course)
}