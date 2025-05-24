package day19_24052025_Threads.avant_Java5;

public class PrintDataDB implements Runnable {

	@Override
	public void run() {
		for (int j = 0; j < 20; j++) {
			System.out.println("Printing Data in DB : " + j+" Thread : "+Thread.currentThread().getName());
		}

	}

}
