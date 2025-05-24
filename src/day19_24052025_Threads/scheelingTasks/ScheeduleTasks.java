package day19_24052025_Threads.scheelingTasks;

import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheeduleTasks {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Callable<Double> c1 = ()->{
			double x = Math.random()*1000;
			System.out.println(LocalTime.now()+" : "+x);
			return x;
			};
		
		Runnable r1 = ()->System.out.println(LocalTime.now()+" : "+Math.random()*1000);
		
		System.out.println(LocalTime.now());
		
		//service.schedule(c1, 5, TimeUnit.SECONDS);
		//service.schedule(r1, 8, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(r1, 2, 5, TimeUnit.SECONDS);
		
		
		

	}

}
