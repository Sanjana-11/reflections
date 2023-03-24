package multithreading;

public class ThreadingExample2 {
	public static class MyRunnable implements Runnable {
		public void run() {
			System.out.println("Runnable running");
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new MyRunnable());
		thread.start();

	}
}
