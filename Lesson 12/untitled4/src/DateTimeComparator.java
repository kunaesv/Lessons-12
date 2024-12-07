import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {
    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        // Сравниваем годы
        int yearComparison = Integer.compare(dt1.year, dt2.year);
        if (yearComparison != 0) {
            return yearComparison;
        }

        int monthComparison = Integer.compare(dt1.month, dt2.month);
        if (monthComparison != 0) {
            return monthComparison;
        }

        int dayComparison = Integer.compare(dt1.day, dt2.day);
        if (dayComparison != 0) {
            return dayComparison;
        }

        int hoursComparison = Integer.compare(dt1.hours, dt2.hours);
        if (hoursComparison != 0) {
            return hoursComparison;
        }

        int minutesComparison = Integer.compare(dt1.minutes, dt2.minutes);
        if (minutesComparison != 0) {
            return minutesComparison;
        }

        return Integer.compare(dt1.seconds, dt2.seconds);
    }
}