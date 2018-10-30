package cn.chen.newsapi.user.service.impl

import cn.chen.newsapi.user.entity.User
import cn.chen.newsapi.user.mapper.UserMapper
import cn.chen.newsapi.user.service.IUserService
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

/**
 *
 *
 * 服务实现类
 *
 *
 * @author chen
 * @since 2018-10-31
 */
@Service
class UserServiceImpl : ServiceImpl<UserMapper, User>(), IUserService
