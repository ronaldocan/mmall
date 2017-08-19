package com.mmall.util;

import com.google.zxing.common.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.util.DigestUtils;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/5.
 */
public class DateTimeUtil {
    
    public static final String STANDARD_FORMAT  = "yyyy-mm-dd HH:mm:ss";
    public static final String SIMPLY_FORMAT = "yyyy-mm-dd";

    public static Date strToDate(String dateTimeStr, String format) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date, String format) {
        if(date == null){
            return org.apache.commons.lang3.StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(format);
    }
    public static Date strToDate(String dateTimeStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date){
        if(date == null){
            return org.apache.commons.lang3.StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }

    public static void main(String[] args) {
        System.out.println(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
        System.out.println(DateTimeUtil.strToDate("2010-01-01 11:11:11","yyyy-MM-dd HH:mm:ss"));
        String bs = DigestUtils.md5DigestAsHex("password".getBytes());

        System.out.println(DigestUtils.md5DigestAsHex("password".getBytes()));
        System.out.println(bs);
    }

}
