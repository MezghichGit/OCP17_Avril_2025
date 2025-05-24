package day19_24052025_Threads.concurrency_examples;

import java.util.concurrent.*;

public class ZooInfo {
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			//service = Executors.newSingleThreadExecutor();
			//service = Executors.newFixedThreadPool(2);
			service = Executors.newCachedThreadPool();
			System.out.println("begin");
			
		    Runnable t1 = () -> System.out.println("Printing zoo inventory 1 " +Thread.currentThread().getName());
		    Runnable t2 = () -> {
				for (int i = 0; i < 3; i++)
					System.out.println("Printing record: " + i + " "+ Thread.currentThread().getName());
			};
		    Runnable t3 =() -> System.out.println("Printing zoo inventory 2 "+Thread.currentThread().getName());
			service.execute(t1);
			service.execute(t2);
			service.execute(t3);
			System.out.println("end");
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
