package hello;

import java.util.Scanner;

public class MyTest {
	
	static void func1() {
		int year = 2024;
		int month = 3;
		int day = 4;
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}
	
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
	
	static void  func3() {
		String s1 = "" + 7 + 7;
		String s2 = 7 + 7 + "";
		
		System.out.println(s1);
		System.out.println(s2);
	}
	
	static void func4() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println("첫번째 입력: " + a);
		
		String s = sc.next();
		System.out.println("두번째 입력: " + s);
	}
	
	public static void main (String[] args) {
		func1();
		func2();
		func3();
		func4();
	}
}
