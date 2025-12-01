public class PortfolioProject {
	
	
	static class CountingUpThread extends Thread {  //Thread class for counting up
		public void run() {
			for (int i = 1; i <= 20; i++) {
				System.out.println("Counting up: " + i);
				try {
					Thread.sleep(175);
				} catch (InterruptedException oops) {
					System.out.println("CountingUpThread interrupted.");
				}
			}
		}
	}
	
	
	static class CountingDownThread extends Thread {  //Thread class for counting down
		public void run() {
			for (int i = 20; i >= 0; i--) {
				System.out.println("Counting down: " + i);
				try {
					Thread.sleep(175);
				} catch (InterruptedException oops) {
					System.out.println("CountingDownThread interrupted.");
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
	
		System.out.println("Let the counting begin ");  //Intro message
		
		CountingUpThread thread1 = new CountingUpThread();  //Create and start the first thread
		thread1.start();
		
		try {  //Main thread waits for thread1 to finish counting up
			thread1.join();
		} catch (InterruptedException oops) {
			System.out.println("Main thread interrupted.");
		}
		
		System.out.println("Counting down");
		
		CountingDownThread thread2 = new CountingDownThread();  //Create and start the second thread
		thread2.start();
		
		try {  //Main thread waits for thread2 to finish counting down
			thread2.join();
		} catch (InterruptedException oops) {
			System.out.println("Main thread interrupted.");
		}
		
		System.out.println("Both threads have completed their counting.");
	}
}
