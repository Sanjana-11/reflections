package executorService;

import java.util.Timer;
import java.util.TimerTask;

public class ExecutorServiceExample7 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Task executed.");
			}
		};
		timer.scheduleAtFixedRate(task, 0, 5000);
	}

}
