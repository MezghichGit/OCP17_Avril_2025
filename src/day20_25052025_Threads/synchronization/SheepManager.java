package day20_25052025_Threads.synchronization;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
    //private int sheepCount = 0;

    //private void incrementAndReport() {
     //   System.out.print((++sheepCount) + " ");
       // System.out.println("*** Running Task! Thread Name: " + Thread.currentThread().getName());
   // }
	private AtomicInteger sheepCount = new AtomicInteger(0);

    private void incrementAndReport() {
        //System.out.print(sheepCount.incrementAndGet() + " "+ Thread.currentThread().getName()+ " \t");
    	System.out.print(sheepCount.incrementAndGet()+ " ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(10);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
