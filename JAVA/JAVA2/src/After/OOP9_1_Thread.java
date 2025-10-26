// 여러 스레드 만들기
package After;

public class OOP9_1_Thread {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread(1, 5);
		MyThread thread2 = new MyThread(2, 10);
		thread1.start();
		thread2.start();
	}
}

class MyThread extends Thread {
	private int threadId;
	private int count;
	
	public MyThread(int threadId, int count) {
		this.threadId = threadId;
		this.count = count;
	}
	
	@Override
	public void run() {
		System.out.println("Thread " + threadId + " started.");
		
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
