package org.chench.extra.spring.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/*
 * 定时任务
 * @author: chench9@lenovo.com
 * @desc: org.chench.extra.spring.task.ScheduleTask
 * @date: 8/24/19 4:57 PM
 */
@Component
public class ScheduleTask {
    private static final Logger logger = LoggerFactory.getLogger(ScheduleTask.class);

    // 每隔1秒执行一次
    @Scheduled(fixedDelay = 1000)
    public void task(){
        logger.info("now: {}", new Date());
    }
}
