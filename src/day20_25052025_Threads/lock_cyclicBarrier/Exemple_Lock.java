package day20_25052025_Threads.lock_cyclicBarrier;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Exemple_Lock {
	public static void printHello(Lock lock) throws InterruptedException {
		try {
			lock.lock();
			System.out.println("Hello :" + Thread.currentThread().getName());
			Thread.sleep(1000);
		} finally {
			lock.unlock();
		}
	}

	public static void main(String args[]) throws InterruptedException {

		Lock lock = new ReentrantLock();
          
		new Thread(() -> {
			try {
				printHello(lock);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start(); // new Thread T : c'est lui qui va executer printHello
		// new Thread(() -> printHello(lock)).start();
		Thread.sleep(100);
		if (lock.tryLock()) {  // c'est le thread main
			try {
				System.out.println("Lock obtained, entering protected code");
			} finally {
				lock.unlock();
			}
		} else {
			System.out.println("Unable to acquire lock, doing something else");
		}

	}
}
