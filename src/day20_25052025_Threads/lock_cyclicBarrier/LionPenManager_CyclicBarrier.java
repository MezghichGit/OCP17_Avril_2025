package day20_25052025_Threads.lock_cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager_CyclicBarrier {
	private void removeAnimals() {
        System.out.println("Removing animals "+Thread.currentThread().getName());
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen "+Thread.currentThread().getName());
    }

    private void addAnimals() {
        System.out.println("Adding animals  "+Thread.currentThread().getName());
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) throws InterruptedException, BrokenBarrierException {
        removeAnimals();
        c1.await();
        cleanPen();
        c2.await();
        addAnimals();
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManager_CyclicBarrier manager = new LionPenManager_CyclicBarrier();

            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));

            for (int i = 0; i < 4; i++) {
                service.submit(() -> {
					try {
						manager.performTask(c1, c2);
					} catch (InterruptedException | BrokenBarrierException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
