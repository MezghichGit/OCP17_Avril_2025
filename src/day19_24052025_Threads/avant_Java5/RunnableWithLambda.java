package day19_24052025_Threads.avant_Java5;

public class RunnableWithLambda {

	public static void main(String[] args) {
		Runnable task1 = () -> {
			for (int i = 0; i < 20; i++) {
				System.out.println("Printing Data in Log : " + i + " Thread : " + Thread.currentThread().getName());
			}
		};

		Runnable task2 = () -> {
			for (int j = 0; j < 20; j++) {
				System.out.println("Printing Data in DB : " + j + " Thread : " + Thread.currentThread().getName());
			}
		};
		
		System.out.println("Thread main Start : Thread : "+Thread.currentThread().getName());
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		
		
		for (int k = 0; k < 20; k++) {
			System.out.println("main thread : " + k + " Thread : " + Thread.currentThread().getName());
		}
		
		System.out.println("Thread main End Thread : "+Thread.currentThread().getName());

	}

}
