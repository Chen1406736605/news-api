package cn.chen.newsapi.system.service.impl

import cn.chen.newsapi.system.entity.Channel
import cn.chen.newsapi.system.mapper.ChannelMapper
import cn.chen.newsapi.system.service.IChannelService
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

/**
 *
 *
 * 服务实现类
 *
 *
 * @author chen
 * @since 2018-11-08
 */
@Service
class ChannelServiceImpl : ServiceImpl<ChannelMapper, Channel>(), IChannelService
