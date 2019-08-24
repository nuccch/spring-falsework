package org.chench.extra.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * 应用全局配置
 * @author: chench9@lenovo.com
 * @desc: org.chench.extra.spring.config.AppConfig
 * @date: 8/24/19 4:53 PM
 */
@Configuration
//@EnableScheduling       // 支持定时任务调度
@ComponentScan(basePackages = "org.chench.extra.spring")
public class AppConfig {
    //TODO: 可以在这里注册Bean对象
}
