package dd;

import java.util.Scanner;

public class subeom {
	
	public static void main(String[] args) {
		
		System.out.println("원하는 번호를 입력하세요");
		System.out.println("1. 사용자로부터 2개의 정수 a, b를 입력받아서 a를 b로 나눈 몫을 출력");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.println("5. ");
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		while(true) {
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("프로그램 종료");
				return;
			case 2:
				System.out.println("2번 기능");
				break;
			case 3:
				System.out.println("3번 기능");
				break;
			case 4:
				System.out.println("4번 기능");
				break;
			case 5:
				System.out.println("5번 기능");
				break;
			default:
				System.out.println("잘못된 입력, 다시 입력하세요");
			}
		}
	}
	
	static void func2() {
		
		System.out.println("두 개의 정수를 입력해주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
			
		int r = 0;
		try {
			r = a/b;
		}catch(ArithmeticException ae) {
			System.out.println("오류 발생, 0으로 나눌 수 없음");
		}
		
		System.out.println(a + "를 " + b + "로 나눈 몫:" + r);
		
	}
	
	static void func3() {
		
	}
}
