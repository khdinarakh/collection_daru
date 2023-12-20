package com.company.week;

public enum Weekday {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

    public boolean isWeekDay(){
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday(){
        return !isWeekDay();
    }

    public static void printDayInfo(Weekday day) {
        System.out.println("Day: " + day);
        System.out.println("Is Weekday: " + day.isWeekDay());
        System.out.println("Is Holiday: " + day.isHoliday());
    }
    //isWeekDay()
    // isHoliday()
}
