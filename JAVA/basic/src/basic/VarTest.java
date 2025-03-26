package basic;

import java.util.Scanner;

public class VarTest {
	
	public static void main(String[] args) {
		// 문제 1
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력해주세요: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a+b;
		
		System.out.println("두수 의 합: " + c);
		//문제 2
		System.out.println("당신의 출생년도: ");
		int year = sc.nextInt();
		int old = 2025 - year;
		
		System.out.println("당신의 나이는: " + old);
		// 문제 3
		System.out.println("당신의 이름: ");
		String name = sc.next();
		
		System.out.println("당신의 국어점수: ");
		int kor = sc.nextInt();
		
		System.out.println("당신의 수학점수: ");
		int math = sc.nextInt();
		
		System.out.println("당신의 영어점수: ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		double avr = total/3.0d; 
		
		System.out.println("이름: " + name + ",총점: " + total + ",평균: " + avr);
		
		
	
		
	}

}
