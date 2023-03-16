package com.techacademy;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class KadaiFirstControllerRestController {
	@GetMapping("dayofweek/19980313")
		   public static String[] dispDayOfWeek(String ymd){
			   try{
			     String date[] = {"日曜","月曜","火曜","水曜","木曜","金曜","土曜"};

			     SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			     sdf.setLenient(false);
			     sdf.parse(ymd);

			     int y = Integer.parseInt(ymd.substring(0,4));
			     int m = Integer.parseInt(ymd.substring(4,6))-1;
			     int d = Integer.parseInt(ymd.substring(6,8));

			     Calendar cal = Calendar.getInstance();
			     cal.set(y, m, d);

			     return date;
			   }

	/* 足し算 */
	@GetMapping("/plus/{val1}/{val2}")
	public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
		int plus = 0;
		plus = val1 + val2;
		return plus;
	}

	/* 引き算 */
	@GetMapping("/minus/{val1}/{val2}")
	public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
		int minus = 0;
		minus = val1 - val2;
		return minus;
	}

	/* 掛け算 */
	@GetMapping("/times/{val1}/{val2}")
	public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
		int times = 0;
		times = val1 * val2;
		return times;
	}

	/* 割り算 */
	@GetMapping("/devide/{val1}/{val2}")
	public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
		int devide = 0;
		devide = val1 % val2;
		return devide;
	}
}