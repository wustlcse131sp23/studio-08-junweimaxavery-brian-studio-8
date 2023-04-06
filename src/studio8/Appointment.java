package studio8;

import java.util.Objects;

public class Appointment {
	private Date theDate;
	private Time theTime;
	
	public Appointment(Date theDate, Time theTime) {
		this.theDate = theDate;
		this.theTime = theTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(theDate, theTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(theDate, other.theDate) && Objects.equals(theTime, other.theTime);
	}

	@Override
	public String toString() {
		return "Appointment [theDate=" + this.theDate + ", theTime=" + this.theTime + "]";
	}
	
	
}
