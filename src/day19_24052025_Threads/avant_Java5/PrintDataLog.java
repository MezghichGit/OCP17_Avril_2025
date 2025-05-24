package day19_24052025_Threads.avant_Java5;

public class PrintDataLog implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Printing Data in Log : " + i +" Thread : "+Thread.currentThread().getName());
		}

	}

}
