package day2_Excption;

public class TestTryCatch {
	
	public static void main(String[] args ) {
		test2();
	}
	
	static void test1() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(0/0);
		}catch (Exception e) {
			System.out.println("예외 발생");
		}

		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
	}
	
	static void test2() {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch (Exception e) {
			System.out.println(5);
		} // try-catch의 끝
		System.out.println(6);
	}
	
}
