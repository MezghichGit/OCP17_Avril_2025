package day19_24052025_Threads.concurrency_examples;

import java.util.concurrent.*;

public class ZooInfo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			//service = Executors.newSingleThreadExecutor();
			//service = Executors.newFixedThreadPool(2);
			service = Executors.newCachedThreadPool();
			System.out.println("begin");
			
			Callable<Double> c1 = ()->Math.random()*1000;
		    Runnable t1 = () -> System.out.println("Printing zoo inventory 1 " +Thread.currentThread().getName());
		    
		    Runnable t2 = () -> {
				for (int i = 0; i < 3; i++)
					System.out.println("Printing record: " + i + " "+ Thread.currentThread().getName());
			};
		    Runnable t3 =() -> System.out.println("Printing zoo inventory 2 "+Thread.currentThread().getName());
			//service.execute(t1);
		    Future<?> res = service.submit(t1);
			service.execute(t2);
			Future<Double> res2 =service.submit(c1);
			service.execute(t3);
			System.out.println("Result Task 1 : "+res.get());
			System.out.println("Result Callable 1 : "+res2.get());
			System.out.println("iS Done Callable 1 : "+res2.isDone());
			System.out.println("end");
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
