package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class SuBeom {
	
	static ArrayList<String> name = new ArrayList<>();
	static ArrayList<Student> students = new ArrayList<>();
	
	public static void main(String[] args) {
		
		System.out.println("1부터 4까지 원하는 메뉴를 선택해주세요.(0누를 시 종) ");
		System.out.println("1. 두 개의 정수 a,b를 입력받아 나눈 몫 출력");
		System.out.println("2. 10부터 1까지 500ms로 출력");
		System.out.println("3. 어레이 리스트로 사용자가 입력하는 문자열 추가");
		System.out.println("4. 이름 점수 학번 멤버로 갖는 Student클래스");
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		while(true) {
			menu = sc.nextInt();
			switch(menu) {
				case 0:
					System.out.println("프로그램 종료.");
					return;
				case 1:
					func1();
					break;
				case 2:
					func2();
					break;
				case 3:
					func3();
					break;
				case 4:
					func4();
					break;
				default:
					System.out.println("1부터 4까지 중에 입력해주세요.");
			}
		}
	}
	
	static void func1() {
		System.out.println("정수 두개를 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = 0;
		
		try {
			r = a/b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println(a +"를 " + b + "로 나눈 몫: " + r);
	}
	
	static void func2() {
		CountThread cth = new CountThread();
		cth.start();
	}
	
	static void func3() {
		System.out.println("이름을 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();		
		
		if(name.contains(str)) {
			System.out.println("동일한 이름이 있어 추가하지 않습니다.");
		} else {
			name.add(str);
			System.out.println("\n\n명단출력");
			System.out.println(name);
		}
	}
	
	static void func4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요: ");
		String name = sc.next();
		
		System.out.println("학번을 입력해주세요 : ");
		int num = sc.nextInt();
		
		System.out.println("점수를 입력해주세요: ");
		int score = sc.nextInt();
		
		Student st = new Student(name, num, score);
		
		students.add(st);
		System.out.println(students);
		
		
	}
}

class CountThread extends Thread {
	@Override
	public void run() {
		
		for(int i =10; i >= 1; i--) {
			System.out.println(i + "초");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Student {
	String name;
	int number;
	int score;
	
	Student(String name, int number, int score) {
		this.name = name;
		this.number = number;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ", 학번: " + number + ", 점수: " + score;
	}
}