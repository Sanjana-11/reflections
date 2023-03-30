package executorService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample9 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Callable<Integer>> tasks = Arrays.asList(
                new Task1(),
                new Task2(),
                new Task3(),
                new Task4()
        );

        List<Future<Integer>> results = executor.invokeAll(tasks);

        for (Future<Integer> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}

class Task1 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 1 + 2;
    }
}

class Task2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 2 * 3;
    }
}

class Task3 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 3 * 4;
    }
}

class Task4 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 4 * 5;
    }
}
