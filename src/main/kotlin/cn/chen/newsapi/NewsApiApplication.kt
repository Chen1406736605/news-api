package cn.chen.newsapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NewsApiApplication

fun main(args: Array<String>) {
    runApplication<NewsApiApplication>(*args)
}
