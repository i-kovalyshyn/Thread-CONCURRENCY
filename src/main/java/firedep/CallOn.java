package main.java.firedep;

public class CallOn implements Runnable {
    private Alarm alarm;

    CallOn(Alarm alarm) {
        this.alarm = alarm;
    }

    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                alarm.alarmOn();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
