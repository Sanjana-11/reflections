package executorService;

public class ExecutorServiceExample2 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Thread thread = new Thread(new Task());
			thread.start();
		}
	}
}

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread running " + Thread.currentThread().getName());
	}
	
}