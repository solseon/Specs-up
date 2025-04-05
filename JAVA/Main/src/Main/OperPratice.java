package Main;

import java.util.Scanner;

public class OperPratice {

	public static void main(String[] args) {
		func7();
	}
	
	//연산자 실습 결과예측 연습1
	static void func1() {
		
		System.out.println("fello java");
		int x = 10;
		int y = 10;
		
		//-x + 3
		System.out.println(-x+3);
		
		//x + 3 * y
		System.out.println(x + 3 * y);
		
		//x + 3 > y - 2
		System.out.println(x + 3 > y - 2);
		
		// x > 3 && x < 5
		System.out.println(x > 3 && x < 5);
	}
	//연산자 실습 결과예측 연습2
	static void func2() {
		
		Scanner sc = new Scanner(System.in);
		// a = 8
		int a = sc.nextInt();
		System.out.println(a << 2 + 1); // 64
		System.out.println( (a >> 2) + 1); // 3
		
		//<<	왼쪽 시프트 (Left Shift)	곱셈 효과 (x * 2^n)
		//>>	오른쪽 시프트 (Right Shift)	나눗셈 효과 (x / 2^n)

		// x = 1
		int x = sc.nextInt();
		System.out.println( x < -1 || x > 3 && x < 5); // false
		// || 연산자보다 && 연산자가 우선순위
	}
	//증감 연산자 결과예측 연습1
	static void func3() {
		 int i = 5;
		 i++;
		 System.out.println(i);
		 
		 int j = 5;
		 ++j;
		 System.out.println(j);
	}
	//증감 연산자 결과예측 연습2
	static void func4() {
		int i, j;
		i = 5;
		j = i++;
		System.out.println("j=i++; 결과, i=" + i + ", j=" + j);
	}
	//증감 연산자 결과예측 연습3
	static void func5() {
		int i, j;
		i = 5;
		j = ++i;
		System.out.println("j=++i; 결과, i=" + i +", j=" + j);
	}
	//증감 연산자 결과예측 연습4
	static void func6() {
		int i=5, j=5;
		
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i = " + i + ", j = " + j);
	}
	/* 산술연산자 테스트
	입력받은 정수값을 시,분,초로 변경하는 프로그램을 만들어라.
	예를 들어 4000을 입력하면 4000초는 1시간 6분 40초 라는 결과로 나와야한다. */
	static void func7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("초(second)를 입력하시오: ");
		int time = sc.nextInt();
		
		int hour;
		int min;
		int sec;
		
		hour = time/3600;
		min = (time%3600)/60;
		sec = (time%3600)%60;
		// time%3600을 변수로 만들고 치환해줘도 가능하다.
		/* 또 다른 방법
		 int sec = time%60;
		 
		 int temp = time/60;
		 
		 int min = temp%60;
		 
		 int hour = temp/60; */
		System.out.println(hour + "시간, " + min + "분, " + sec +"초");
	}
	/* float pi = 3.141592f
	문제 1) 다음 실수를 소수점 3자리까지만 표시하시오. 산술 연산과 형변환을 사용한다.*/
	static void func8() {
		float pi = 3.141592f;
		pi = ((int)(pi*1000))/1000F;
		System.out.println(pi);
	}
	//문제 2) 소수 네째자리에서 반올림해서 소수점 3자리까지 표시하시오.
	static void func9() {

		float pi = 3.141592f;
		pi = ((int)((pi + 0.0005)*1000))/1000F;
		System.out.println(pi);
	}
	// 문제 3) Math.round()를 이용해서 네째 자리에서 반올림해서 소수점 3자리를 표현하시오.
	static void func10() {
		// Math.round() : 소수점 첫째자리에서 반올림한 값을 반환
		float pi = 3.141592f;
		pi = (Math.round(pi*1000))/1000F;
		System.out.println(pi);
	}
}
