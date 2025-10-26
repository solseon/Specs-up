package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class SuBeom {
	
	static ArrayList<String> name = new ArrayList<String>();
	static ArrayList<Student> students = new ArrayList<Student>();
	
 	public static void main(String[] args) {
 		
 		System.out.println("1부터 5까지 메뉴를 선택하고 1번이 눌리면 종료");
 		System.out.println("2. 두 개의 정수 a, b를 입력받아 a를 b로 출력");
 		System.out.println("3. 1부터 10까지 1초마다 출력하는 스레드를 작성하고 실행");
 		System.out.println("4. 어레이리스트를 생성해 사용자가 입력하는 문자열을 추가하고 전체 입력된 값을 출력");
 		System.out.println("5. 학생의 이름과 점수를 저장하고 전체 정보를 출력");
 		System.out.println("6. 학생이름 검색");
 		
 		Scanner sc = new Scanner(System.in);
 		int menu;
 		
 		while(true) {
 			menu = sc.nextInt();
 			switch(menu) {
 			case 1:
 				System.out.println("프로그램 종료.");
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
 			case 6:
 				func6();
 				break;
 			default:
 				System.out.println("잘못된 입력, 다시 입력하세요");
 			}
 		}
	}
 	
 	static void func2() {
 		
 		System.out.println("두 개의 정수를 입력하세요: ");
 		Scanner sc = new Scanner(System.in);
 		int a = sc.nextInt();
 		int b = sc.nextInt();
 		int r = 0;
 		
 		try {
			r = a/b;
		} catch (ArithmeticException e) {
			System.out.println("오류 발생, 0으로 나눌 수 없음");
		}
 		
 		System.out.println(a +"를 " + b + "로 나눈 몫: " + r);
 	}
 	
 	static void func3() {
 		CountThread cth = new CountThread();
 		cth.start();
 	}
 	
 	static void func4() {
 		
 		System.out.println("추가할 이름을 입력하세요: ");
 		Scanner sc = new Scanner(System.in);
 		
 		String str = sc.next();
 		
 		name.add(str);
 		
 		System.out.println("\n\n전체 명단");
 		System.out.println(name);
 	}
 	
 	static void func5() {
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.println("학생이름: ");
 		String str = sc.next();
 		
 		System.out.println("점수: ");
 		int score = sc.nextInt();
 		
 		Student st = new Student(str, score);
 		students.add(st);
 		
 		System.out.println(students);
 	}
 	
 	static void func6() {
 		
 		int len = name.size();
 		System.out.println("총 " + len + "명의 이름이 있습니다.");
 		
 		System.out.println("확인할 이름을 입력");
 		Scanner sc = new Scanner(System.in);
 		String str = sc.next();
 		
 		if(name.contains(str)) {
 			System.out.println("동일한 이름이 있습니다.");
 		} else {
 			System.out.println("동일한 이름이 없습니다.");
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
	
	@Override
	public String toString() {
		return name+":"+score;
	}
}

class CountThread extends Thread{
	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	
	