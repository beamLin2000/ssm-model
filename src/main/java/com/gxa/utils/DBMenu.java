package com.gxa.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class DBMenu {
    private static String MENU1;
    private static String MENU2;
    private static String MENU3;

    static {
//        InputStream inputStream = DBMenu.class.getClassLoader().getResourceAsStream("menu.properties");

        try {
            Properties properties = new Properties();
            properties.load(new InputStreamReader(DBMenu.class.getClassLoader().getResourceAsStream("menu.properties"),"GBK"));
            MENU1 = properties.getProperty("menu.admin");
            MENU2 = properties.getProperty("menu.doctor");
            MENU3 = properties.getProperty("menu.finance");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getMenu1(){
        String menu = MENU1;
        return menu;
    }

    public static String getMenu2(){
        String menu = MENU2;
        return menu;
    }

    public static String getMenu3(){
        String menu = MENU3;
        return menu;
    }
}
