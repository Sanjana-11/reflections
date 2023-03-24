package multithreading;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread running: " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}
	}
}

public class ThreadingExample11 {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Thread completed");
	}
}
