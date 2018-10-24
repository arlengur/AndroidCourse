package ru.arlen.lesson7;

import java.text.DateFormatSymbols;
import java.util.Calendar;

/**
 * Вывод дней недели.
 *
 * @author galin-an
 */
public class PrintDays {
    public static void main(String[] args) {
        int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        printDays(day);
    }

    /**
     * Вывод оставшихся дней до конца недели.
     *
     * @param day номер дня недели
     */
    private static void printDays(int day) {
        if (day < 1 || day > 7) {
            System.out.println("Некорректный день недели.");
            return;
        }
        DateFormatSymbols dfs = new DateFormatSymbols();
        String weekdays[] = dfs.getWeekdays();
        switch (day) {
            case Calendar.MONDAY:
                System.out.println(weekdays[Calendar.TUESDAY]);
            case Calendar.TUESDAY:
                System.out.println(weekdays[Calendar.WEDNESDAY]);
            case Calendar.WEDNESDAY:
                System.out.println(weekdays[Calendar.THURSDAY]);
            case Calendar.THURSDAY:
                System.out.println(weekdays[Calendar.FRIDAY]);
            case Calendar.FRIDAY:
                System.out.println(weekdays[Calendar.SATURDAY]);
            case Calendar.SATURDAY:
                System.out.println(weekdays[Calendar.SUNDAY]);
                break;
            default:
                System.out.println("Последний день");
        }
    }
}
