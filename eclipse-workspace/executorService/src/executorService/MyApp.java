package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
	public void run() {
        String threadName = Thread.currentThread().getName();
		System.out.println("task performing by" + threadName);
	}
}

public class MyApp {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 10; i++) {
			Runnable task = new MyTask();
			executor.submit(task);
		}

		executor.shutdown();
	}
}
