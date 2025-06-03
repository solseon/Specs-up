package bbb.bbb;

import aaa.aaa.TestB;

public class TestC {
	public static void main(String[] args) {
		
		TestB t = new TestB();
		System.out.println(t.a);
//		System.out.println(t.b);
//		System.out.println(t.c);
//		System.out.println(t.d);
	}
}

class TestD extends TestB{	// 상속
	
	void func() {
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
	}
}
