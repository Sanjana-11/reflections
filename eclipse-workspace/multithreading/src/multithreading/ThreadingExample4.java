package multithreading;

public class ThreadingExample4 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			String threadName = Thread.currentThread().getName();
			Database.a = Database.a + 1;
			System.out.println(threadName + "running " + Database.a);
		};

		for (int i = 0; i < 3; i++) {
			Thread thread1 = new Thread(runnable, "Thread 1 ");

			Thread thread2 = new Thread(runnable, "Thread 2 ");

			thread1.start();
			thread2.start();
		}
		System.out.println("Value of a is : " + Database.a);
	}
}

class Database {
	static int a = 0;

}
