package main.java.FireDepartment;

public class CallOff implements Runnable {
    private Alarm alarm;

    CallOff(Alarm alarm) {
        this.alarm = alarm;
    }

    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                alarm.alarmOff();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
