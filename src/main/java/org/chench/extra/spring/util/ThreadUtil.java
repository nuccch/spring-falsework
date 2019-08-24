package org.chench.extra.spring.util;

/*
 * @author: chench9@lenovo.com
 * @desc: org.chench.extra.spring.util.ThreadUtil
 * @date: 8/24/19 4:58 PM
 */
public class ThreadUtil {

    public static void sleep(long million) {
        try {
            Thread.sleep(million);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleepOfSecond(int second) {
        sleep(second * 1000);
    }

    private ThreadUtil() {}
}
