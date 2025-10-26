// Runnable과 스레드
package After;

public class OOP9_1_Thread_Runnable {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyRunnable(1, 5));
		thread1.start();
	}
}

class MyRunnable implements Runnable {
	private int threadId;
	private int count;
	
	public MyRunnable(int threadId, int count) {
		this.threadId = threadId;
		this.count = count;
	}
	
	@Override
	public void run() {
		System.out.println("Thread " + threadId + " started. ");
		
		for(int i = 0; i <= count; i++) {
			System.out.println("Thread " + threadId + ": " + i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread " + threadId + " finished.");
	}
	
}
