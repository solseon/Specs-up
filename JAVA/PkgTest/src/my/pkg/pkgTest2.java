package my.pkg;

import my.pkg2.ExterTest;	// import my.pkg2.*; 처럼 한 줄로 표현가능
import my.pkg2.pkgTest3;

public class pkgTest2 {
	
	public static void main(String[] args) {
		pkgTest3 t = new pkgTest3();
		t.showInfo();
		
		ExterTest t2 = new ExterTest();
	}
	
	public void showInfo() {
		System.out.println("pkgTest2 입니다");
	}
}
