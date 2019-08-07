package main.java.FireDepartment;

class Alarm {
    private boolean ring;

    synchronized void alarmOff() throws InterruptedException {
        while (!ring) {
            wait();
        }
        ring = false;
        System.out.println("Everything good - on -" + Thread.currentThread());
        System.out.println("Fireman wait for alarm");
        notify();
    }

    synchronized void alarmOn() throws InterruptedException {
        while (ring) {
            wait();
        }
        ring = true;

        System.out.println("ALARM, FIRE - on -" + Thread.currentThread());
        System.out.println("The fire was extinguished");
        notify();
    }
}
