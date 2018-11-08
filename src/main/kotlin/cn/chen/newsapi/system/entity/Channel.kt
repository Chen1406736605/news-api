package cn.chen.newsapi.system.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import org.springframework.stereotype.Component
import java.io.Serializable

/**
 *
 *
 *
 *
 *
 * @author chen
 * @since 2018-11-08
 */
@Component
class Channel : Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null

    /**
     * 类型名称
     */
    var typeName: String? = null

    /**
     * 类型枚举
     */
    var type: String? = null

    override fun toString(): String {
        return "Channel{" +
                "id=" + id +
                ", typeName=" + typeName +
                ", type=" + type +
                "}"
    }

    companion object {

        private const val serialVersionUID = 1L
    }
}
