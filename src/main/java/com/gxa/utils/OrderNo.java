package com.gxa.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class OrderNo {
    public static String orderNum(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        Date date = new Date();
        String str =simpleDateFormat.format(date);
        Random random = new Random();
        int ranNum = (int) (random.nextDouble() * (9999 - 1000 + 1)) + 1000;
        String generateNo = str + ranNum;
        return generateNo;
    }
}
