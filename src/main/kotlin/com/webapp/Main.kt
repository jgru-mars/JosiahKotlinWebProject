package com.webapp
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// This is the main function that runs the program
//I am using spring and mustache to create html

@SpringBootApplication
open class SeminarWebApp

fun main(args: Array<String>) {
    runApplication<SeminarWebApp>(*args)
}