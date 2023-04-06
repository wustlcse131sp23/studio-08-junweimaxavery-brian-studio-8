package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Date> dates = new LinkedList<>();
		HashSet<Date> hashDates = new HashSet<>();
		HashSet<Appointment> appointments = new HashSet<>();
		
		Date d1 = new Date(12, 20, 2003);
		Date d2 = new Date(12, 21, 2003);
		
		Time t1 = new Time(12, 20, 06, true);
		Time t2 = new Time(23, 13, 50, false);
		
		Appointment a1 = new Appointment(d1, t1);
		Appointment a2 = new Appointment(d2, t1);
		Appointment a3 = new Appointment(d1, t2);
		Appointment a4 = new Appointment(d1, t1);

		dates.add(d1);
		dates.add(d2);
		dates.add(d1);
		
		hashDates.add(d1);
		hashDates.add(d2);
		hashDates.add(d1);
		
		appointments.add(a1);
		appointments.add(a2);
		appointments.add(a3);
		appointments.add(a4);
		
		System.out.println(appointments);
	}
}
