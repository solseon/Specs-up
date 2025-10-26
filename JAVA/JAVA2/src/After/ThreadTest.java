package After;

import java.util.Scanner;

public class ThreadTest {
	public static void main(String[] args) {
		// 백그라운드 스레드 시작
		CountThread th1 = new CountThread();
		th1.start();
		
		// 사용자 입력 대기
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(input.equalsIgnoreCase("q")) {
			th1.finish();
		}
		try {
			th1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}

class CountThread extends Thread{
	private boolean isRunning;
	void finish() {
		isRunning = false;
	}
	
	@Override
	public void run() {
		isRunning = true;
		int count = 1;
		
		while(isRunning) {
			System.out.println(count + "초");
			count++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("스레드 종료");
	}
}
