package executorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample8 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);

		List<Future> futureList = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
			Future<Integer> f = executor.submit(new NewTask());
			futureList.add(f);
		}
		// do independent activities
		for (int i = 0; i < 50; i++) {
			Future<Integer> f = futureList.get(i);
			try {
				Integer result = f.get();
				System.out.println(result);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

}

class NewTask implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		return new Random().nextInt();
	}

}