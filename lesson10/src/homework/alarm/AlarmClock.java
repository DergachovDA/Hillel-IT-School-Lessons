package homework.alarm;

import java.util.Calendar;

public class AlarmClock {
    private String name;

    private int hours;
    private int minutes;
    private int seconds;

    private int hoursAlarm;
    private int minutesAlarm;
    private boolean switchAlarm;

    public AlarmClock() {
        name = "Default clock";
        Calendar calendar = Calendar.getInstance();
        hours = calendar.get(Calendar.HOUR_OF_DAY);
        minutes = calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        hours = calendar.get(Calendar.HOUR_OF_DAY);
        minutes = calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND);
    }

    private boolean validTime(int hours, int minutes) {
        return (hours > -1 && hours < 24 && minutes > -1 && minutes < 60);
    }

    public void setAlarmTime(int hours, int minutes) {
        if (validTime(hours, minutes)) {
            hoursAlarm = hours;
            minutesAlarm = minutes;
            switchAlarm = true;
        } else {
            System.out.println("You entered the wrong alarm time for the " + name);
        }
    }

    void setSwitchAlarm(boolean sw) {
        switchAlarm = sw;
        }

    public void fireAlarm() {
        System.out.println("Alarm!!! Wake up!!!");
    }

    public boolean isAlarmTime() {
        return (switchAlarm && hours == hoursAlarm && minutes == minutesAlarm);
    }

    public void printCurrentTime() {
        System.out.println(hours + timeToString(minutes) + timeToString(seconds));
        if (switchAlarm)
            System.out.println("Alm." + hoursAlarm + timeToString(minutesAlarm));
    }

    private String timeToString(int t) {
        String time = "" + t;
        time = time.length() > 1 ? ":" + time : ":0" + time;
        return time;
    }

}