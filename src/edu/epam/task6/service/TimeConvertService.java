package edu.epam.task6.service;

public class TimeConvertService {
    public int[] secondsConvert(int seconds)
    {
        if(seconds > 86400) {
            throw new IllegalArgumentException("Count of seconds is more than in one day!");
        }
        else {
            int hours = seconds / 3600;
            int minutes = (seconds - hours* 3600)  / 60;
            int remainingSeconds = seconds - hours * 3600 - minutes * 60;
            int[] time = {hours, minutes, remainingSeconds};
            return time;
        }
    }

}
