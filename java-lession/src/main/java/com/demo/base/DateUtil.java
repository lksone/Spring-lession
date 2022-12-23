package com.demo.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static void main(String[] args) {
        //能拿到推后30天时间的代码
        //获取系统当前时间
        Calendar currentdate = Calendar.getInstance();
        //在这里进行加30天（ps:周六周日也算在里边了）
        currentdate.add(Calendar.DATE, -30);
        //得到最后的时间
        Date finalday = currentdate.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(finalday));
    }
}
