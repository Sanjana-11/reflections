package executorService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample10 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(4);

		List<Callable<Integer>> tasks = Arrays.asList(new Task1(), new Task2(), new Task3(), new Task4());

		Integer result = executor.invokeAny(tasks);

		System.out.println(result);

		executor.shutdown();
	}
}

