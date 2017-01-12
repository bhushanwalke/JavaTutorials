package com.bhushan.Java.Classes;

/**
 * Created by bhushan on 12/30/16.
 */
public class CustomTime {

    private int hour;
    private int minute;
    private int second;

    public void setTime(int hr, int min, int sec) {
        if (hr < 0 || hr > 24 ||
                min < 0 || min > 60 ||
                sec < 0 || sec > 60) {
            throw new IllegalArgumentException(
                    "hour, minute, second was out of range"
            );
        }

        this.hour = hr;
        this.minute = min;
        this.second = sec;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
