package com.gxa.utils.systemSettings;
        import java.util.Random;

/**
 * @program:
 * @description: 生成随机盐
 * @author: cchan
 * @create: 2020年7月7
 **/
public class CodeUtil {
    private final static String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private final static String num = "0123456789";

    /**
     * 生成盐
     *
     * @return
     */
    public static String salt() {
        String uuid = new String();
        for (int i = 0; i < 4; i++) {
            char ch = str.charAt(new Random().nextInt(str.length()));
            uuid += ch;
        }
        return uuid;
    }

}