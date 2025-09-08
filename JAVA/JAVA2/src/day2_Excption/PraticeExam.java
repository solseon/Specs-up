package day2_Excption;

import java.util.Scanner;

/*
 * 두 개의 정수를 입력받아 첫번째 수를 두번째 수로 나눈 결과를 출력
 * 이때 음수가 입력되면 프로그램 종료
 * 0으로 나누려고 할 때 예외처리를 하세요*/
public class PraticeExam {
	public static void main(String[] args) {
		method();
	}
	
	static void method() {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("첫번쨰 정수를 입력해주세요: ");
			int num1 = sc.nextInt();
			
			System.out.println("두번쨰 정수를 입력해주세요: ");
			int num2 = sc.nextInt();
			
			
			
			if((num1 < 0) || (num2 < 0)) {
				System.out.println("음수가 입력되어 프로그램이 종료됩니다.");
				break;
			} else {
				try {
					int result = num1/num2;
					System.out.println(result);
				} catch (Exception e) {
					System.out.println("0이 입력되어 예외처리됩니다.");
				}
			}
		}
	}
}
