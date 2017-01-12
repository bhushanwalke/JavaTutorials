package com.bhushan.Java.Classes;

/**
 * Created by bhushan on 12/30/16.
 */
public class CustomTime1 {
    private int hour;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    private int minute;
    private int second;

    public CustomTime1() {
        this(0, 0, 0);
    }

    public CustomTime1(int hr) {
        this(hr, 0, 0);
    }

    public CustomTime1(int hr, int min) {
        this(hr, min, 0);
    }

    public CustomTime1(CustomTime1 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public CustomTime1(int hr, int min, int sec) {
        if (hr < 0 || hr > 24)
            throw new IllegalArgumentException("Incorrect range for hour");

        if (min < 0 || min > 60)
            throw new IllegalArgumentException("Incorrect range for minute");

        if (sec < 0 || sec > 60)
            throw new IllegalArgumentException("Incorrect range for second");

        this.hour = hr;
        this.minute = min;
        second = sec;
    }

    public void setTime(int hr, int min, int sec) {
        if (hr < 0 || hr > 24)
            throw new IllegalArgumentException("Incorrect range for hour");

        if (min < 0 || min > 60)
            throw new IllegalArgumentException("Incorrect range for minute");

        if (sec < 0 || sec > 60)
            throw new IllegalArgumentException("Incorrect range for second");

        this.hour = hr;
        this.minute = min;
        second = sec;
    }

    public String toUTC() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
