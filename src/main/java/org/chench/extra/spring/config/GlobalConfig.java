package org.chench.extra.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 * @author: chench9@lenovo.com
 * @desc: org.chench.extra.spring.config.GlobalConfig
 * @date: 8/24/19 4:56 PM
 */
@Configuration
@PropertySource(value = "classpath:/application.properties", encoding = "utf-8")
public class GlobalConfig {
    // APP版本
    @Value("${app.version}")
    private String appVersion;

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
