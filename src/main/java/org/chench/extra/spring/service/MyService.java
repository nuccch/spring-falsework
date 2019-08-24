package org.chench.extra.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 服务
 * @author chench9@lenovo.com
 * @desc org.chench.extra.spring.service.MyService
 * @date 8/24/19 5:06 PM
 */
@Service
public class MyService {
    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    public void action() {
        logger.info("action...");
    }
}
