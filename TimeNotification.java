package maslyuk.lesya.gmail.com;

import maslyuk.lesya.gmail.com.impl.CurrentDateServerImpl;
import maslyuk.lesya.gmail.com.impl.CurrentDateClientImpl;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeNotification {

    public static void main(String[] args) {
        CurrentDateServerImpl currentDateServer1 = new CurrentDateServerImpl();
        CurrentDateServerImpl currentDateServer2 = new CurrentDateServerImpl();

        CurrentDateClientImpl currentDateClient1 = new CurrentDateClientImpl("Client Olesya");
        CurrentDateClientImpl currentDateClient2 = new CurrentDateClientImpl("Client Anton");
        CurrentDateClientImpl currentDateClient3 = new CurrentDateClientImpl("Client Alexey");
        CurrentDateClientImpl currentDateClient4 = new CurrentDateClientImpl("Client Olya");

        currentDateServer1.registerObserver(currentDateClient1);
        currentDateServer1.registerObserver(currentDateClient2);
        currentDateServer1.registerObserver(currentDateClient4);

        currentDateServer2.registerObserver(currentDateClient2);
        currentDateServer2.registerObserver(currentDateClient3);

        scheduler(currentDateServer1);
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduler(currentDateServer2);
    }


    public static void scheduler(CurrentDateServerImpl currentDateServer){

        // creating timer task, timer
        TimerTask taskSendDate = new TimerTask() {
            @Override
            public void run() {
                //System.out.println("Time's up to know date!");
                //System.exit(0); //Stops the AWT thread (and everything else)
                currentDateServer.setDate(new Date());
            }
        };
        Timer timer = new Timer();

        // scheduling the task at interval
        timer.schedule(taskSendDate,1000, 5000);
    }

}
