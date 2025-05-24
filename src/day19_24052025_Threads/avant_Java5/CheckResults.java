package day19_24052025_Threads.avant_Java5;

public class CheckResults {
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		
		// other thread
		new Thread(() -> {
			for (int i = 0; i < 1000; i++)
			{
				CheckResults.counter++;
				System.out.println("Counter : "+CheckResults.counter);
				}
		}).start();
		Thread.sleep(1000);
		// thread main
		while (CheckResults.counter < 1000) {
			System.out.println("Not reached yet");
		}
		System.out.println("Reached!");
		// sending email.....
	}
}
