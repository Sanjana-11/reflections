package multithreading;

public class ThreadingExample3 {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Runnable runninggg");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
	

}
