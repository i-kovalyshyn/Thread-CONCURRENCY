package main.java.Server;


import java.util.Random;

public class Server extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(HttpServ());
        }
    }

    private String HttpServ() {
        String obtain = "";
        int i = new Random().nextInt(HttpMethod.values().length);
        HttpMethod httpMethod = HttpMethod.values()[i];
        System.out.println("HttMethods is: " + httpMethod);
        switch (httpMethod) {
            case GET:
                obtain = "Request for resource from server-" + Thread.currentThread();
                break;
            case POST:
                obtain = "Submit data to the server-" + Thread.currentThread();
                break;
            case PUT:
                obtain = "The data should be stored-" + Thread.currentThread();
                break;
            case DELETE:
                obtain = "Delete a resource-" + Thread.currentThread();
                break;
        }
        return obtain;

    }

}

