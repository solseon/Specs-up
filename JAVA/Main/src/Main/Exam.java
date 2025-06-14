package Main;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		while(true) {
			ShowMenu();
			
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: func1(); break;
			case 2: func2(); break;
			case 3: func3(); break;
			case 4: //func4(); break;
			case 5: System.out.println("프로그램 종료...");return;
				default:
					System.out.println("다시 선택해주세요: ");
				
			}	
		}
	}
	
	static void ShowMenu() {
		System.out.println("원하는 메뉴를 선택하세요:");
		System.out.println("1. 정수 두 개를 입력받아 합을 출력");
		System.out.println("2. 2~9사이 정수를 입력받아 해당 구구단 출력");
		System.out.println("3. 두 개의 문자열을 입력받아 동일한지 여부를 출력");
		System.out.println("4. 기능 D");
		System.out.println("5. 프로그램을 종료합니다.");
	}
	
	static void func1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력해주세요: ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력해주세요: ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	static void func2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 단을 출력할지 입력해주세요(2~9): ");
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
	
	static void func3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 문자열을 입력해주세요: ");
		String str1 = sc.next();
		
		System.out.println("두 번째 문자열을 입력해주세요: ");
		String str2 = sc.next();
		
		if(str1.equals(str2)) {
			System.out.println("동일한 문자열 입니다.");
		} else {
			System.out.println("동일하지 않은 문자열 입니다.");
		}
	}
}
