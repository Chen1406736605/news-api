package cn.chen.newsapi.system.controller


import cn.chen.newsapi.system.entity.Channel
import cn.chen.newsapi.system.mapper.ChannelMapper
import cn.chen.newsapi.util.Gv
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

import org.springframework.web.bind.annotation.RestController

/**
 *
 *
 * 前端控制器
 *
 *
 * @author chen
 * @since 2018-11-08
 */
@RestController
@RequestMapping(Gv.VERSION)
class ChannelController {

    @Autowired
    var channel: Channel? = null

    @Autowired
    var channelMapping: ChannelMapper? = null

    @GetMapping("/system-init/channel")
    fun SystemInit(): List<Channel>? {

        return channelMapping!!.selectList(QueryWrapper())
    }
}

