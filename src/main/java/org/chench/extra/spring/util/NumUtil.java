package org.chench.extra.spring.util;

/*
 * @author: chench9@lenovo.com
 * @desc: org.chench.extra.spring.util.NumUtil
 * @date: 8/24/19 4:58 PM
 */
public class NumUtil {

    public static int parse2Int(String str) {
        if(str == null || "".equals(str.trim())) {
            return 0;
        }
        try {
            return Integer.valueOf(str.trim());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private NumUtil() {}
}
