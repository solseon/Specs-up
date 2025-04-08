package Main;

import java.util.Scanner;

public class Day4Class {
	
	
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
