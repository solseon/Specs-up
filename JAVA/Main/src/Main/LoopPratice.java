package Main;

import java.util.Scanner;

// 반복문(for, while, do-while)
public class LoopPratice {
	public static void main(String[] args) {
		func13();
	}
	// 구구단 출력(2단~9단)
	static void func1() {
		for(int i=2; i<10; i++) {
			System.out.println("\n" + i + "단");
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}	
	}
	// 별찍기(이중for문)
	static void func2() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++ ) {
				System.out.print("*"); //println이 아닌 print로 출력해야 일자로 나오지 않는다.
			}
			System.out.println();
		}
	}
	// 기본 문제) 각각의 for문을 실행했을때 어떤 결과가 출력 될지를 예측하자.
	static void func3() {
		for(int i=0; i<3; i++) {
			System.out.print(i + " ");
			//0 1 2
		}
		for (int j=0; j<100; j++) {
			System.out.print(j + " ");
			//  0 1 .. 99
		}	
		for(int k=10; k>0; k--) {
			System.out.print(k + " ");
			// 10 9 .. 1
		}	
		for(int a=0; a<10; a+=2) {
			System.out.print(a + " ");
			// 0 2 4.. 8
		}
		for(int s=0, f=0; s<10; s++, f++) {
			System.out.print(s + f + " ");
			//0 2 4 .. 18
		}
	}
	// 구구단 8단 출력
	static void func4() {
		for(int i=1; i<10; i++) {
			System.out.println("8 * " + i + " = " + 8*i);
		}
	}
	// 2부터 9사이 정수 입력받아 해당 구구단 출력
	static void func5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요: ");
		int dan = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
	//while 코드의 결과 예상
	static void func6() {
		int a=0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
			// 0 1 2.. 9
		}
	}
	// for문 while문으로 바꾸기
	static void func7() {
		/*for(int i=10; i>0; i--) {
			System.out.print(i + " ");
		}*/
		int i=10;
		while(i>0) {
			System.out.print(i + " ");
			i--;
		}
	}
	static void func8() {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 하나를 입력하세요. q가 입력되면 종료합니다");
		
		do {
			ch = sc.next().charAt(0);
			System.out.println("입력한 문자: " + ch);
		}while(ch != 'q');
		
		System.out.println("프로그램을 종료합니다");
	}
	// 별찍기(이중for문)
	static void func9() {
		for(int i=10; i>0; i--) {
			for(int j=0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// break 코드예측
	static void func10() {
		for(int i =1; i <=100; i++) {
			if(i%7 == 0) break;
			System.out.println(i + ", ");
		}
		// 7의 나머지 0 따라서 i=7일때 break로 인해 for문 탈출 = 1~6까지 출력
	}
	// continue 코드예측
	static void func11() {
		for(int i =1; i <=100; i++) {
			if(i%7 == 0) continue;
			System.out.println(i + ", ");
		}
		// 7의 배수일때는다음 반복을 하므로 7의 배수 제외하고 100까지 모두출력
	}
	// 이중 for문 연습
	static void func12() {
		for(int i=2; i<5; i++) {
			System.out.println(i + "단");
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
	// 이중 for문 연습2
	static void func13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n을 입력해주세요: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
