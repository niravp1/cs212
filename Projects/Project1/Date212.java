package Projects.Project1;

public class Date212 {
    private int year;
    private int month;
    private int day;

    public Date212(String s) {
        year = Integer.parseInt(s.substring(0, 4));
        month = Integer.parseInt(s.substring(4, 6));
        day = Integer.parseInt(s.substring(6, 8));
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Date212 otherDate = (Date212) other;
        return year == otherDate.year && month == otherDate.month && day == otherDate.day;
    }

    public int compareTo(Date212 other) {
        if (year != other.year) {
            return year - other.year;
        }
        if (month != other.month) {
            return month - other.month;
        }
        return day - other.day;
    }

    public String toString() {
        String[] monthArray = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthArray[month - 1] + " " + day + ", " + year;
    }

    public String getOriginalFormat() {
        return String.format("%04d%02d%02d", year, month, day);
    }
}