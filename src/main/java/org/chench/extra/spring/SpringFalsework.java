package org.chench.extra.spring;

import org.chench.extra.spring.config.AppConfig;
import org.chench.extra.spring.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/*
 * 程序启动入口
 * @author: chench9@lenovo.com
 * @desc: org.chench.extra.spring.SpringFalsework
 * @date: 8/24/19 4:50 PM
 */
public class SpringFalsework {
    private static final Logger logger = LoggerFactory.getLogger(SpringFalsework.class);

    public static void main(String[] args) {
        logger.info("Start...");
        init();
        addShutdownHook();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.start();
        context.getBean(MyService.class).action();
        logger.info("Done.");
    }

    // 初始化
    private static void init() {
        //TODO: 初始化参数
    }

    // 注册关闭钩子
    private static void addShutdownHook() {
        Signal sg = new Signal("TERM"); // kill -15 pid
        // 监听信号量
        Signal.handle(sg, new SignalHandler() {
            @Override
            public void handle(Signal signal) {
                System.out.println("signal handle: " + signal.getName());
                System.exit(0);
            }
        });

        // 注册关闭钩子
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                // 在关闭钩子中执行收尾工作
                // 注意事项：
                // 1.在这里执行的动作不能耗时太久
                // 2.不能在这里再执行注册，移除关闭钩子的操作
                // 3 不能在这里调用System.exit()
                //TODO
                logger.info("do shutdown hook");
            }
        });
    }
}
