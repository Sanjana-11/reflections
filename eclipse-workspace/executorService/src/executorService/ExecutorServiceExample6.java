package executorService;

import java.util.Timer;
import java.util.TimerTask;

public class ExecutorServiceExample6 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Task executed after 5 seconds.");
			}
		};
		timer.schedule(task, 5000); 
	}

}
