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
		// TODO Auto-generated method stub

	}

}
