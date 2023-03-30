package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample1 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);

		executor.execute(newRunnable("Task 1"));
		executor.execute(newRunnable("Task 2"));
		executor.execute(newRunnable("Task 3"));

		executor.shutdown();
	}

	static Runnable newRunnable(String msg) {
		return new Runnable() {
			public void run() {
				String threadName = Thread.currentThread().getName();
				System.out.println("Thread name : " + threadName + "; Task : " + msg);
			}
		};
	}
}
