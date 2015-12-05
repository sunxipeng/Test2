package com.sunxipeng.test;

/**
 * Created by Administrator on 2015/12/5.
 */
public class TimeTool {

    private final static long yearLevelValue = 365 * 24 * 60 * 60 * 1000;
    private final static long monthLevelValue = 30 * 24 * 60 * 60 * 1000;
    private final static long dayLevelValue = 24 * 60 * 60 * 1000;
    private final static long hourLevelValue = 60 * 60 * 1000;
    private final static long minuteLevelValue = 60 * 1000;
    private final static long secondLevelValue = 1000;


    public static String getDifference(long nowTime, long targetTime) {//Ŀ��ʱ���뵱ǰʱ���
        long period = targetTime - nowTime;
        return getDifference(period);
    }

    public static String getDifference(long period) {//���ݺ�������ʱ���


        String result = null;


        /*******�����ʱ����е��ꡢ�¡��ա��졢ʱ���֡���*******/

        int day = getDay(period);
        int hour = getHour(period - day * dayLevelValue);
        int minute = getMinute(period - day * dayLevelValue - hour * hourLevelValue);
        int second = getSecond(period - day * dayLevelValue - hour * hourLevelValue - minute * minuteLevelValue);


        result = day + "��" + hour + "ʱ" + minute + "��" + second + "��";
        return result;
    }

    public static int getYear(long period) {
        return (int) (period / yearLevelValue);
    }

    public static int getMonth(long period) {
        return (int) (period / monthLevelValue);
    }

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


  /*  public static void main(String[] args) {

        String pat1 = "yyyy-MM-dd HH:mm:ss";

        String a = "2015-12-17T12:13:11";

        a = a.replaceAll("T", " ");

        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);

        Date b = null;
        try {
            b = sdf1.parse(a);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Date nowdate = new Date();

        System.out.println(getDifference(b.getTime() - nowdate.getTime()));


    }*/
}
