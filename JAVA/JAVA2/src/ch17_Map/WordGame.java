package ch17_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordGame {
	static Map<String, String> word = new HashMap<String, String>();
	
	public static void main(String[] args) {
		System.out.println("===== 단어 암기 프로그램 =====");
		System.out.println("1. 한글단어와 영어단어 저장");
		System.out.println("2. 저장된 모든 단어 보기");
		System.out.println("3. 한글단어 삭제");
		System.out.println("4. 한글단어 수정");
		System.out.println("5. 기본데이터 복사");
		System.out.println("6. 게임모드");
		System.out.println("7. 프로그램 종료");
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		while(true) {
			System.out.println("메뉴 선택: ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				func1();
				break;
			case 2:
				func2();
				break;
			case 3:
				//func3();
				break;
			case 4:
				//func4();
				break;
			case 5:
				//func5();
				break;
			case 6:
				//func6();
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("1~6사이 번호를 입력하세요.");
			}
		}
	}
	
	static void func1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한글 단어 입력: ");
		String Kword = sc.next();
		
		System.out.println("영어 단어 입력: ");
		String Eword = sc.next();
		
		word.put(Kword, Eword);
	}
	
	static void func2() {
		System.out.println(word.toString());
	}
}
