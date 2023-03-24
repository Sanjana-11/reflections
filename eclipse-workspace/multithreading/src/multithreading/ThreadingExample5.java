package multithreading;

public class ThreadingExample5 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("Lambda runningg");
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
