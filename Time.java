package edu3;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Time {
	int hour;
	int min;
	int sec;
	
	Time(){
		hour=LocalDateTime.now().getHour();
		min=LocalDateTime.now().getMinute();
		sec=LocalDateTime.now().getSecond();
	}
	Time(long millis){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);

		hour = calendar.get(Calendar.HOUR_OF_DAY);
		min = calendar.get(Calendar.MINUTE);
		sec = calendar.get(Calendar.SECOND);
	}
	Time(int h, int m, int s){
		hour=h;
		min=m;
		sec=s;
	}
	
	int getHour() {
		return hour;
	}
	int getMin() {
		return min;
	}
	int getSec() {
		return sec;
	}
	
	void setTime(long ms) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(ms);

		hour = calendar.get(Calendar.HOUR_OF_DAY);
		min = calendar.get(Calendar.MINUTE);
		sec = calendar.get(Calendar.SECOND);
	}
	
//	void getTime() {
//		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//	}
}
