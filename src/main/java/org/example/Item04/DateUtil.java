package org.example.Item04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static String daysBetweenDates(Date startDate, Date endDate) {
        long difference = endDate.getTime() - startDate.getTime();
        return difference/1000/60/60/24 + " days";
    }
}
