// 스레드 만들기 기본
package After;

public class OOP9_1_Thread_basic {
	public static void main(String[] args) {
		SimpleThread thread1 = new SimpleThread();
		thread1.start();
	}
}

class SimpleThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread started. ");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread finished. ");
	}
}
