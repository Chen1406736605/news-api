package cn.chen.newsapi.user.entity

import java.time.LocalDateTime
import java.io.Serializable

/**
 *
 *
 *
 *
 *
 * @author chen
 * @since 2018-10-31
 */
class User : Serializable {

    /**
     * 登录账号
     */
    var account: Int? = null

    /**
     * 登录密码
     */
    var password: Int? = null

    /**
     * 用户昵称
     */
    var username: String? = null

    var gmtCreate: LocalDateTime? = null

    var gmtModified: LocalDateTime? = null

    var deleted: Boolean? = null

    override fun toString(): String {
        return "{" +
                "account=" + account +
                ", password=" + password +
                ", username=" + username +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", isDeleted=" + deleted +
                "}"
    }

    companion object {

        private const val serialVersionUID = 1L
    }
}
