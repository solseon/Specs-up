package basic;

import java.util.Scanner;

public class Varpratice {
	
	public static void main(String[] args) {
		func6();
		
	}
	
	// 세 개의 변수를 선언하고 오늘 연, 월, 일로 초기화 후 출
	static void func1() { 
		
		int year = 2024;
		int month = 3;
		int day = 4;
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}
	//두 개의 변수를 선언하고 각각 10과 20으로 초기화
	//두 변수에 저장된 값을 서로 교환
	//위 두 변수를 출력
	static void func2() {
		
		int x = 10;
		int y = 20;
		int tmp = 0;
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:" + x + " y:" + y);
	}
	// 입출력
	static void func3() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println("첫번째 입력: " + a);
		
		String s = sc.next();
		System.out.println("두번째 입력: " + s);
	}
	// 문제1 두 개 정수를 사용자로부터 입력 받아 그 합을 출력하시오.
	static void func4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력해주세요: ");
		
		int add;
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		add = a + b;
		
		System.out.println("두 수의 합: " + add);
	}
	//문제2 2024년에 태어나면 1살이다. 출생년도를 입력받아 나이를 계산해서 출력하시오.
	static void func5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출생년도를 입력해주세요: ");
		int year = sc.nextInt();
		
		int old = 2025 - year;
		
		System.out.println("당신의 나이: " + old);
	}
	//문제3 이름을 문자열로 입력받고 국,영,수 점수를 정수로 입력받아 평균과 총점을 출력하시오.
	static void func6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오: ");
		String name = sc.next();
		
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력하시오: ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int score = kor + eng + math;
		double avr = score/3.0d;
		//명시적으로 double임을 나타내기위해 d 표시 안 붙여도 상관x
		//하지만 float형은 f를 붙여서 명시적으로 나타내줘야함.
		
		System.out.println("이름:" + name + ", 평균:" + avr + ", 총점:" + score);
		
	}
}
