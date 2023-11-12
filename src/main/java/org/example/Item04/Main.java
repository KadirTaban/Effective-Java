package org.example.Item04;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 10);

        String formattedDate = DateUtil.formatDate(startDate, "yyyy-MM-dd");
        System.out.println("formatted date : " + formattedDate);

        String daysBetween = DateUtil.daysBetweenDates(startDate, endDate);
        System.out.println("days between : " + daysBetween);
    }
}
