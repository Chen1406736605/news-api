package cn.chen.newsapi.generator

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException
import com.baomidou.mybatisplus.core.toolkit.StringUtils
import com.baomidou.mybatisplus.generator.AutoGenerator
import com.baomidou.mybatisplus.generator.config.DataSourceConfig
import com.baomidou.mybatisplus.generator.config.GlobalConfig
import com.baomidou.mybatisplus.generator.config.PackageConfig
import com.baomidou.mybatisplus.generator.config.StrategyConfig
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy

import java.util.Scanner

object CodeGenerator {

    /**
     *
     *
     * 读取控制台内容
     *
     */
    fun scanner(tip: String): String {
        val scanner = Scanner(System.`in`)
        val help = StringBuilder()
        help.append("请输入$tip：")
        println(help.toString())
        if (scanner.hasNext()) {
            val ipt = scanner.next()
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt
            }
        }
        throw MybatisPlusException("请输入正确的$tip！")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // 代码生成器
        val mpg = AutoGenerator()

        // 全局配置
        val gc = GlobalConfig()
        val projectPath = System.getProperty("user.dir")
        gc.outputDir = "$projectPath/src/main/kotlin"
        gc.author = "chen"
        gc.isOpen = false
        mpg.globalConfig = gc

        // 数据源配置
        val dsc = DataSourceConfig()
        dsc.url = "jdbc:mysql://localhost:3306/news?useUnicode=true&useSSL=false&characterEncoding=utf8"
        // dsc.setSchemaName("public");
        dsc.driverName = "com.mysql.jdbc.Driver"
        dsc.username = "debian-sys-maint"
        dsc.password = "Yxie52uGiMHYw5jE"
        mpg.dataSource = dsc

        // 包配置
        val pc = PackageConfig()
        pc.moduleName = scanner("模块名")
        pc.parent = "cn.chen.newsapi"
        mpg.packageInfo = pc

        // 策略配置
        val strategy = StrategyConfig()
        strategy.naming = NamingStrategy.underline_to_camel
        strategy.columnNaming = NamingStrategy.underline_to_camel
        strategy.isRestControllerStyle = true
        strategy.setInclude(scanner("表名"))
        strategy.setSuperEntityColumns("id")
        strategy.isControllerMappingHyphenStyle = true
        strategy.setTablePrefix(pc.moduleName + "_")
        mpg.strategy = strategy
        mpg.execute()
    }

}
