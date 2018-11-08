package cn.chen.newsapi.system.controller

import cn.chen.newsapi.util.Gv
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author chen
 * @date 2018/11/8 16:59
 */
@RestController
@RequestMapping(Gv.VERSION)
class articleControllet {

    @GetMapping("system/article")
    fun SystemArticle() {


    }
}