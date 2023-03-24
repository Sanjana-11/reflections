package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingExample9 {
	public static void main(String[] args) {
	ExecutorService executor = Executors.newFixedThreadPool(2);

	for (int i = 0; i < 5; i++) {
	    executor.submit(() -> {
	        System.out.println(Thread.currentThread().getName() + " is running");
	    });
	}

	executor.shutdown();
	}

}
