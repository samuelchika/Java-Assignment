/*Design a class named Time. The class contains:
     The data fields hour, minute, and second that represent a time.
     A no-arg constructor that creates a Time object for the current time. (The
     values of the data fields will represent the current time.)
     A constructor that constructs a Time object with a specified elapsed time
     since midnight, January 1, 1970, in milliseconds. (The values of the data
     fields will represent this time.)
     A constructor that constructs a Time object with the specified hour, minute,
     and second.
     Three getter methods for the data fields hour, minute, and second,
     respectively.
     A method named setTime(long elapseTime) that sets a new time
     for the object using the elapsed time. For example, if the elapsed time is
     555550000 milliseconds, the hour is 10, the minute is 19, and the second is
     10.
    Write
    a test program that creates two Time objects (using new Time() and new
    Time(555550000)) and displays their hour, minute, and second in the format
    hour:minute:second.
    Hint: The first two constructors will extract the hour, minute, and second
    from the elapsed time. For the no-arg constructor, the current time can be
    obtained using System.currentTimeMillis() * 
 * */
package com.cSam.classes;
public class Time {
	
		long time;
		int timeHour;
		int timeMinute;
		int timeSecond;
		
		public Time() {
			time = System.currentTimeMillis();
		}
		public Time(long elapsedTime) {
			time = elapsedTime;
		}
		public Time(int hours, int minutes, int seconds) {
			timeHour = hours;
			timeMinute = minutes;
			timeSecond = seconds;
		}
		public void setTime(long elapsedTime) {
			time = elapsedTime;
		}
		
		public int hour() {
			timeHour = (int)(time / (1000 * 60 * 60)) % 24;
			return timeHour;
		}
		public int minute () {
			timeMinute = (int)(time / (1000 * 60)) % 60;
			return timeMinute;
		}
		public int second () {
			timeMinute = (int)(time / (1000)) % 60;
			return timeSecond;
		}
		
		
}
