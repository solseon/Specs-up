package Main;

import java.util.Scanner;

public class ControlPratice {
	public static void main(String[] args) {
		func2();
	}
	//예제 1) of ~ else (짝수,홀수 판별기)
	static void func1() {
		System.out.println("정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
	/*
	 예제 2 ) if~ else if ~ else
	• 점수를 입력 받고 다음과 같이 학점을 출력하세요
	A 90 점 이상
	B 80 점 이상 90점 미만
	C 70점 이상 80점 미만
	D 60점 이상 70점 미만
	F 60점 미만*/
	static void func2() {
		System.out.println("학점을 입력하시오: ");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		} else if(score < 90 && score >= 80) {
			System.out.println("B");
		} else if(score < 80 && score >= 70) {
			System.out.println("C");
		} else if(score < 70 && score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
	//카드게임 메뉴 만들기
	static void func3() {
		System.out.println("카드 게임을 시작합니다. 원하는 메뉴를 선택하세요");
	}
}
