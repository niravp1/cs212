package Projects.Project2;
/**
 * Represents a date with year, month, and day components.
 * Dates are created from strings in YYYYMMDD format.
 * Provides comparison functionality for sorting dates chronologically.
 * 
 * @author Your Name
 * @version 1.0
 */
public class Date212 {
	/** The year component of the date */
	private int year;
	
	/** The month component of the date (1-12) */
	private int month;
	
	/** The day component of the date (1-31) */
	private int day;
	
	/**
	 * Constructs a Date212 object from a string in YYYYMMDD format.
	 * Parses the string to extract year, month, and day values.
	 * 
	 * @param a a string representing a date in YYYYMMDD format (e.g., "20211117")
	 */
	public Date212(String a) {
		int y = Integer.parseInt(a.substring(0, 4));
		int m = Integer.parseInt(a.substring(4, 6));
		int d = Integer.parseInt(a.substring(6, 8));
		
		year = y;
		month = m;
		day = d;
	}
	
	/**
	 * Returns the year component of this date.
	 * 
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Returns the month component of this date.
	 * 
	 * @return the month (1-12)
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * Returns the day component of this date.
	 * 
	 * @return the day (1-31)
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * Sets the year component of this date.
	 * 
	 * @param y the new year value
	 */
	public void setYear(int y) {
		year = y;
	}
	
	/**
	 * Sets the month component of this date.
	 * 
	 * @param m the new month value (1-12)
	 */
	public void setMonth(int m) {
		month = m;
	}
	
	/**
	 * Sets the day component of this date.
	 * 
	 * @param d the new day value (1-31)
	 */
	public void setDay(int d) {
		day = d;
	}
	
	/**
	 * Returns the name of the month for a given month number.
	 * 
	 * @param month the month number (1-12)
	 * @return the name of the month (e.g., "January", "February")
	 */
	public static String monthName(int month) {
		String[] monthName = {"", "January", "Februray", "March", "April",
							"May", "June", "July", "August", "September",
							"October", "November", "December"};
		return monthName[month];
	}
	
	/**
	 * Returns a string representation of this date in "Month Day, Year" format.
	 * 
	 * @return a formatted string (e.g., "November 17, 2021")
	 */
	public String toString() {
		return monthName(month) + " " + day + ", " + year;
	}
	
	/**
	 * Compares this date to another date chronologically.
	 * Returns a negative integer if this date is earlier,
	 * zero if the dates are equal, or a positive integer if this date is later.
	 * 
	 * @param other the Date212 object to compare to
	 * @return -1 if this date is earlier, 0 if equal, 1 if this date is later
	 */
	public int compareTo(Date212 other) {
		if (this.year < other.year) {
			return -1;
		}
		if (this.year > other.year) {
			return 1;
		}
		if (this.year == other.year && this.month < other.month) {
			return -1;
		}
		if (this.year == other.year && this.month > other.month) {
			return 1;
		}
		if (this.year == other.year && this.month == other.month && this.day < other.day) {
			return -1;
		}
		if (this.year == other.year && this.month == other.month && this.day > other.day) {
			return 1;
		}
		if (this.year == other.year && this.month == other.month && this.day == other.day) {
			return 0;
		}
		return 1;
	}
}