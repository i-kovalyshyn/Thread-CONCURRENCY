package main.java.FireDepartment;

public class Main {
    public static void main(String[] args) {
        Alarm alarm=new Alarm();
        CallOn callOn =new CallOn(alarm);
        CallOff callOff = new CallOff(alarm);

        new Thread(callOff).start();
        new Thread(callOn).start();
    }
}
