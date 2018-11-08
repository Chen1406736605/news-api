package cn.chen.newsapi

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("cn.chen.newsapi.*.mapper")
class NewsApiApplication

fun main(args: Array<String>) {
    runApplication<NewsApiApplication>(*args)
}
