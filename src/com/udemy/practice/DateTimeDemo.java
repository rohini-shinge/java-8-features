package com.udemy.practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();

		int hh = time.getHour();
		int minuts = time.getMinute();
		int ss = time.getSecond();
		int nano = time.getNano();

		System.out.println(dd + "/" + mm + "/" + yy);
		System.out.println(hh + ":" + minuts + ":" + ss + ":" + nano);

		LocalDate birthday = LocalDate.of(1994, Month.DECEMBER, 07);
		System.out.println(birthday);

		LocalDate today = LocalDate.now();

		Period period = Period.between(birthday, today);

		System.out.println(period.getYears() + ":" + period.getMonths() + ":" + period.getDays());

		ZoneId id = ZoneId.systemDefault();
		System.out.println(id);

		System.out.println(ZoneId.getAvailableZoneIds());

	}

}
