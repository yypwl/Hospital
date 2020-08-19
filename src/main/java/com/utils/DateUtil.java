package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtil {
	//指定日期的字符串格式
	private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 将一个表示日期的字符串解析成一个日期对象
	 * @param str
	 * @return
	 */
	public static Date str2Date(String str){
		try {
			return SDF.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 将一个日期对象转换成一个指定格式的字符串
	 * @param d
	 * @return
	 */
	public static String date2Str(Date d){
		return SDF.format(d);
	}
	
	/**
	 * 将util的Date转换为sql的Date对象
	 * @param d
	 * @return
	 */
	public static java.sql.Date dateFromU2S(Date d){
		return new java.sql.Date(d.getTime());
	}
	
	
}
