package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample4 {
	public static void main(String[] aargs) {
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);
		ExecutorService executor = Executors.newFixedThreadPool(coreCount);
		for (int i = 0; i < 30; i++) {
			executor.execute(new Task());
		}
	}
}

