package day4_cond;

import java.util.Scanner;

public class day4_cond {
	
	static void func1() {
		int number = 3;
		
		if (number % 2 == 0) {
		System.out.println("짝수입니다.");
		
		}
	}
	
	static void func2() {
		int number = 3;
		
		if (number == 0) {
			System.out.println("0 입니다.");
		} else if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		}else 
			System.out.println("홀수입니다.");
	}
	
		
	static void func3() {
		
		int number = 85;
		String strGrade = "";
		
		if (number >= 90) {
			strGrade = "A";
		} else if (number >= 80) {
			strGrade = "B";
		} else if (number >= 70) {
			strGrade = "C";
		} else if (number >= 60) {
			strGrade = "D";
		} else {
			strGrade = "F";
		}
		
		System.out.println("당신의 학점은 " + strGrade + "입니다.");
	}
	
	static void func4() {
		
		System.out.println("카드 게임을 시작합니다. 원하는 메뉴를 선택하세요");
		System.out.println("1. 카드를 섞습니다");
		System.out.println("2. 모든 카드를 보여 줍니다");
		System.out.println("3. 원하는 카드를 선택합니다");
		System.out.println("4. 게임을 종료합니다");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if (menu == 1) {
			System.out.println("카드를 섞기를 선택했습니다.");
		} else if (menu == 2) {
			System.out.println("모든 카드를 보여주기를 선택습니다.");
		} else if (menu == 3) {
			System.out.println("카드 선택을 선택했습니다.");
		} else if (menu == 4) {
			System.out.println("게임종료를 선택했습니다.");
		} else {
			System.out.println("오류입니다.");
		}
	}
	
	static void func5() {
		System.out.println("정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	
	static void func6() {
		
		System.out.println("점수를 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		if(grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("B");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("C");
		} else if (grade >= 60 && grade < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}
	
	static void func7() {
		
		int value2 = 2;
		switch(value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		System.out.println();
	}
	
	static void func8() {
		int value2 = 8;
		switch(value2) {
			case 10:
			case 9:
				System.out.println("점수를 입력해주세요: ");
				
				Scanner sc = new Scanner(System.in);
				int grade = sc.nextInt();
			case 8:
				System.out.println("A");
				break;
			case 7:
				System.out.println("A");
				break;
			case 6:
				System.out.println("A");
				break;
			default:
				System.out.println("F");
		}
		System.out.println();
	}
	
	static void func9() {
		
		System.out.println("점수를 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		int value = grade/10;
		
			switch(value) {
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}
		System.out.println();
	}
	
	static void func10() {
		
		System.out.println("단을 입력해주세요(2~9): ");
		
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		for(int i=1; i<10; i++ ) {
			int result = dan*i;
			System.out.println(dan + "*" + i + "=" + result );
		}
	}
	
	static void func11() {
		int a=0;
		while(a<10) {
			System.out.println(a +" ");
			a++;
		}
	}
	
	static void func12() {
		int i = 10;
		while(i>0) {
			System.out.println(i + " ");
			i--;
		}
	}
	
	static void func13() {
		for(int i =1; i <=100; i++) {
			if(i%7 == 0) break;
			System.out.println(i + ", ");
		}
		
	}
	
	static void func14() {
		for(int i =1; i <=100; i++) {
			if(i%7 == 0) continue;
			System.out.println(i + ", ");
		}
	}
	
	static void func15() {
		//110p 풀기
	}
	
	public static void main(String[] args) {
		func14();
	}
}
