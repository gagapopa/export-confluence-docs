package ru.ntk.exportconfluencedocs

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExportConfluenceDocsApplication : CommandLineRunner {

    override fun run(vararg args: String?) {
        println("run")
    }
}

fun main(args: Array<String>) {
    runApplication<ExportConfluenceDocsApplication>(*args)
}
