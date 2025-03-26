package basic;

import java.util.Scanner;

// 단산시관 비논조대
// 항술프계 교리건립
//    트
public class OperTest {	
	static void func1() {
		// 시,분,초 변경 프로그램
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
			
		int hour = time/3600;
				
		int min = (time%3600) / 60;
								
		int sec = (time%3600) % 60;
				
		System.out.println(hour + "시간, " + min + "분, " + sec + "초");
	}
	
	static void func2() {
		float pi = 3.141592f;
		pi = ((int)((pi+0.0005)*1000))/1000F;
		System.out.println(pi);
	}
	
	public static void main(String[] args) {
		func2();
		System.out.println("hello java");
		int x = 10;
		int y = 10;
		
		//-x + 3
		System.out.println(-x + 3);
		
		//x + 3 * y
		System.out.println(x + 3 * y);
		
		//x + 3 > y - 2
		System.out.println(x + 3 > y - 2);
		
		//x > 3 && x < 5
		System.out.println(x > 3 && x < 5);
		
		int i=5, j=5;
		
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i = " + i + ", j = "+ j);
		
	}
}
