package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class SuBeom {
	
	static ArrayList<String> names = new ArrayList<String>(); //명단을 4번을 누를때마다 유지시키기 위해서 전역 변수로 만들어주고 static 까지 붙여준다.
	static ArrayList<Student> students = new ArrayList<Student>();
	
 	public static void main(String[] args) {
		
		System.out.println("원하는 번호를 입력하세요");
		System.out.println("1. 프로그램 종료.");
		System.out.println("2. 사용자로부터 2개의 정수 a, b를 입력받아서 a를 b로 나눈 몫을 출력.");
		System.out.println("3. 1부터 10까지 1초마다 출력하는 스레드 실행.");
		System.out.println("4. 명단에 이름을 입력하고 전체 명단을 출력");
		System.out.println("5. 학생 이름과 점수를 저장하고 전체 정보를 출");
		
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		while(true) {
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("프로그램 종료");
				return;
			case 2:
				func2();
				break;
			case 3:
				func3();
				break;
			case 4:
				func4();
				break;
			case 5:
				func5();
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
		
		// Thread 클래스 호출
		CountThread cth = new CountThread();
		cth.start();
	}
	
	static void func4() {
		System.out.println("추가할 이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		names.add(str);
		
		System.out.println("\n\n전체 명단");
		System.out.println(names);
	}
	
	static void func5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생이름: ");
		String str = sc.next();
		
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		Student st = new Student(str, score);
		students.add(st);
		
		System.out.println(students);
		
	}
}

// 클래스를 밖에 만드는 이유 지연이라는 클래스 안에 만들면 겹치기때
// Thread 클래스 생성
class CountThread extends Thread {

	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		// Try - Catch 문으로 예외 처리 하는 이유 공부하기
			}
		}
	}
}

class Student {
	
	String name;
	int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
		
		
	
	}
}