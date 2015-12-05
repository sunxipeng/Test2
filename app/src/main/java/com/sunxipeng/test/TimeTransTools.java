package com.sunxipeng.test;

/**
 * Created by Administrator on 2015/12/5.
 */
public class TimeTransTools {

    private final static long yearLevelValue = 365 * 24 * 60 * 60 * 1000;
    private final static long monthLevelValue = 30 * 24 * 60 * 60 * 1000;
    private final static long dayLevelValue = 24 * 60 * 60 * 1000;
    private final static long hourLevelValue = 60 * 60 * 1000;
    private final static long minuteLevelValue = 60 * 1000;
    private final static long secondLevelValue = 1000;

    public static int getDay(long period) {

        return (int) (period / dayLevelValue);
    }

    public static int getHour(long period) {

        return (int) (period / hourLevelValue);
    }

    public static int getMinute(long period) {

        return (int) (period / minuteLevelValue);
    }

    public static int getSecond(long period) {

        return (int) (period / secondLevelValue);
    }
    public static String getDifference(long period){

        int day = getDay(period);

        int hour = getHour(period - day * dayLevelValue);

        int minute = getMinute(period - day * dayLevelValue - hour * hourLevelValue);


        return day+"天"+hour+"时"+minute+"分";
    }
}
