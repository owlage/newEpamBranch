package calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Calendar {

    private int year;
    private ArrayList<Holiday> holidays;

    public Calendar(int year) {
        this.year = year;
        this.holidays = new ArrayList<>();

        addWeekend(year);
    }

    private void addWeekend(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);
        while (date.getYear() == year) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                holidays.add(new Holiday(date, "Saturday"));
                date = date.plusDays(1);
            } else if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                holidays.add(new Holiday(date, "Sunday"));
                date = date.plusDays(6);
            } else {
                date = date.plusDays(1);
            }
        }
    }


    public void addHoliday(LocalDate holidayDate, String nameOfHoliday) {
        holidays.add(new Holiday(holidayDate, nameOfHoliday));
        holidays.sort(Comparator.comparing(Holiday::getHolidayDate).thenComparing(Holiday::getNameOfHoliday));
    }

    public void printHolidays() {
        for (Holiday holiday : holidays) {
            System.out.println(holiday);
        }
    }

    public class Holiday {
        private LocalDate holidayDate;
        private String nameOfHoliday;

        public Holiday(LocalDate holiday, String nameOfHoliday) {
            this.holidayDate = holiday;
            this.nameOfHoliday = nameOfHoliday;
        }

        public LocalDate getHolidayDate() {
            return holidayDate;
        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        @Override
        public String toString() {
            return "Holiday{" + holidayDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                    " - " + nameOfHoliday + '}';
        }
    }
}

