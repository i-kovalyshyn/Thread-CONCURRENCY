package main.java.FireDepartment;

class Alarm {
    private int ring = 0;

    synchronized void alarmOff() throws InterruptedException {
        while (ring < 1) {
            wait();
        }
        ring--;
        System.out.println("Everything good - on -" + Thread.currentThread());
        System.out.println("Fireman wait for alarm");
        notify();
    }

    synchronized void alarmOn() throws InterruptedException {
        while (ring >= 1) {
            wait();
        }
        ring++;

        System.out.println("ALARM, FIRE - on -" + Thread.currentThread());
        System.out.println("The fire was extinguished");
        notify();
    }
}
