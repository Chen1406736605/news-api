package kt

import cn.hutool.core.date.DatePattern
import cn.hutool.core.date.DateTime
import cn.hutool.core.date.DateUtil
import org.junit.Test
import java.time.ZoneId
import java.util.*

/**
 * @author chen
 * @date 2018/10/27 13:08
 */

class hw{

    @Test
    fun sayHello() {

        var time = DateTime("2018-10-27 17:08:10", DatePattern.NORM_DATETIME_PATTERN)
        println(DateTime.of(time))
    }
}