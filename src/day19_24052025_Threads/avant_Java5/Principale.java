package day19_24052025_Threads.avant_Java5;

public class Principale {

	public static void main(String[] args) {
			System.out.println("Thread main Start : Thread : "+Thread.currentThread().getName());
			Thread t1 = new Thread(new PrintDataLog());
			
			Thread t2 = new Thread(new PrintDataDB());
			t1.setPriority(Thread.MAX_PRIORITY);
			t2.setPriority(Thread.MIN_PRIORITY);
			
			t1.start();
			t2.start();
		
			System.out.println("Thread main End Thread : "+Thread.currentThread().getName());

	}

}
