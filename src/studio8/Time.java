package studio8;

import java.util.Objects;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	private boolean is24;
	
	public Time(int hours, int minutes, int seconds, boolean is24) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.is24 = is24;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hours, is24, minutes, seconds);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hours == other.hours && is24 == other.is24 && minutes == other.minutes && seconds == other.seconds;
	}

	public String toString() {
		if(this.is24) {
			return this.hours + ":" + this.minutes + ":" + this.seconds;
		}
		else {
			if(this.hours <= 12) {
				return this.hours + ":" + this.minutes + ":" + this.seconds;
			}
			else {
				return this.hours-12 + ":" + this.minutes + ":" + this.seconds;
			}
		}
	}
}