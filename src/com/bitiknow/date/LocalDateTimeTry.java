package com.bitiknow.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;

/**
 * 
 * @author pradeep
 *
 */
public class LocalDateTimeTry {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		System.out.println(
				"##########################################Using Local Date################################################");
		System.out.println("Current date : " + date);
		System.out.println("Current year : " + LocalDate.now().getYear());
		System.out.println("Current month name : " + LocalDate.now().getMonth());
		System.out.println("Current month value : " + LocalDate.now().getMonthValue());
		System.out.println("Current day: " + LocalDate.now().getDayOfMonth());
		System.out.println("Current week: " + LocalDate.now().getDayOfWeek());
		System.out.println(
				"####################################################################################################################");

		System.out.println("-----------Using ChornoField to get same value-----------");
		System.out.println("Current year : " + LocalDate.now().get(ChronoField.YEAR));
		System.out.println("Current month name : " + LocalDate.now().get(ChronoField.MONTH_OF_YEAR));
		System.out.println("Current month value : " + "Not available");
		System.out.println("Current day: " + LocalDate.now().get(ChronoField.DAY_OF_MONTH));
		System.out.println("Current week: " + LocalDate.now().get(ChronoField.DAY_OF_WEEK));
		System.out.println("-------------------------------------------------------");

		LocalDate customizedDate = LocalDate.of(2014, 12, 2);
		System.out.println("Customized date : " + customizedDate);

		System.out.println("XXXXXXXXXXXXXXXXXXXXXUsing Local Time to get same valueXXXXXXXXXXXXXXXXXXXXX");
		LocalTime time = LocalTime.now();
		System.out.println("Current Time : " + time);
		System.out.println("Current hour : " + time.getHour());
		System.out.println("Current minute : " + time.getMinute());
		System.out.println("Current second : " + time.getSecond());
		LocalTime customTime = LocalTime.of(12, 34);
		System.out.println("Custom Time : " + customTime);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

		System.out.println("XXXXXXXXXXXXXXXXXXXXXUsing Local DATE Time to get same valueXXXXXXXXXXXXXXXXXXXXX");
		// No Zone
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

		System.out.println("XXXXXXXXXXXXXXXXXXXXXUsing Local DATE Time  ZONE to get same valueXXXXXXXXXXXXXXXXXXXXX");
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		System.out.println(zonedDateTime.toLocalDate());
		System.out.println(zonedDateTime.toLocalTime());
		System.out.println(zonedDateTime.toLocalDateTime());

		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

		// Create Date
		LocalDateTime dateTime1 = dateTime.plusMonths(2);
		System.out.println(dateTime1);

		System.out.println("XXXXXXXXXXXXXXXXXXXXXRange between dates in time based XXXXXXXXXXXXXXXXXXXXX");
		Duration d1 = Duration.between(dateTime, dateTime1);
		System.out.println(d1.toDays());
		System.out.println(d1.toHours());
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

		System.out.println("XXXXXXXXXXXXXXXXXXXXXRange between dates in year month based XXXXXXXXXXXXXXXXXXXXX");
		Period period = Period.between(LocalDate.of(2015, 2, 5), LocalDate.of(2016, 6, 15));
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

		System.out.println("XXXXXXXXXXXXXXXXXXXXXFormatting date to string XXXXXXXXXXXXXXXXXXXXX");
		LocalDate localDate = LocalDate.of(2016, 6, 5);
		String strDate = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(strDate);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

		// Create Date
		dateTime = LocalDateTime.of(2016, Month.APRIL, 24, 12, 34);
		System.out.println(dateTime);

		date = LocalDate.parse("2017-03-01");
		System.out.println(date);

		LocalDate date2 = date.plusMonths(1);
		if (date2.isBefore(LocalDate.now())) {
			System.out.println("Expiry notification");
		}

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		System.out.println(zonedDateTime.format(dateTimeFormatter));

		String dateS = "March 05, 2016";
		TemporalAccessor accessor = dateTimeFormatter.parse(dateS);
		LocalDate date3 = LocalDate.from(accessor);
		System.out.println(date3);

		Long between = ChronoUnit.DAYS.between(date, LocalDate.now());
		System.out.println(between);

		Period period2 = Period.ofMonths(2);
		LocalDate date4 = LocalDate.now();
		date4 = date4.plus(period2);
		System.out.println(date4);
	}

}
