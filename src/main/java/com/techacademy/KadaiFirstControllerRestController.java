package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class KadaiFirstControllerRestController {
	@GetMapping("/dayofweek/19980313")
	public void dispDayOfWeek(){
		String ymd = "19980313";
		String week = null;

        Calendar cal = Calendar.getInstance();
        int year  = Integer.parseInt(ymd.substring(0, 4));   // 年
        int month = Integer.parseInt(ymd.substring(4, 6)) - 1;  // 月
        int date  = Integer.parseInt(ymd.substring(6, 8));     // 日

        // [初学者向けへの問題]
        // 何年何月何日を設定したことになるでしょうか？
        cal.set(year, month, date);

		// 日付から曜日を取得する
        // Calendar.DAY_OF_WEEK:7 実際の値です（余り意味はない）
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:     // Calendar.SUNDAY:1 （値。意味はない）
                week = "Sunday";
                break;
            case Calendar.MONDAY:     // Calendar.MONDAY:2
            	week = "Monday";
                break;
            case Calendar.TUESDAY:    // Calendar.TUESDAY:3
            	week = "Tuseday";
                break;
            case Calendar.WEDNESDAY:  // Calendar.WEDNESDAY:4
            	week = "Wednesday";
                break;
            case Calendar.THURSDAY:   // Calendar.THURSDAY:5
                week = "Thursday";
                break;
            case Calendar.FRIDAY:     // Calendar.FRIDAY:6
            	week = "Friday";
                break;
            case Calendar.SATURDAY:   // Calendar.SATURDAY:7
            	week = "Saturday";
                break;
        }

        System.out.println(week);
	}

	/* 足し算 */
	@GetMapping("/plus/{val1}/{val2}")
	public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
		int plus = 0;
		plus = val1 + val2;
		return plus;
	}

	/* 引き算 */
	@GetMapping("/minus/{val1}/{val2}")
	public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
		int minus = 0;
		minus = val1 - val2;
		return minus;
	}

	/* 掛け算 */
	@GetMapping("/times/{val1}/{val2}")
	public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
		int times = 0;
		times = val1 * val2;
		return times;
	}

	/* 割り算 */
	@GetMapping("/devide/{val1}/{val2}")
	public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
		int devide = 0;
		devide = val1 / val2;
		return devide;
	}
}