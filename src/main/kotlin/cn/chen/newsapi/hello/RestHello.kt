package cn.chen.newsapi.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author chen
 * @date 2018/10/27 13:13
 */

@RestController
class RestHello {

    @GetMapping("hello")
    fun hw(): Map<String, Int> {

        val map = HashMap<String, Int>()
        map.put("number", 111)
        return map
    }
}