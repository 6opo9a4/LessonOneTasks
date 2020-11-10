package edu.epam.task6.entity;

public class TimeInSeconds {
    private int seconds;
    public TimeInSeconds(int seconds)
    {
        if(seconds<0)
        {
            throw new IllegalArgumentException("Count of Seconds is not valid!");
        }
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "seconds=" + seconds;
    }
}
