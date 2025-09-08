package day2_Excption;

public class ExpctionTest {
	
	public static void main(String[] args) {
		Sleep();
	}
	
	static void test3() {

		try {
			Exception e = new Exception("My Exception"); // Exception 객체생성
			throw e;
		}catch (Exception e) {
			System.out.println("exception 발생");
			System.out.println("error: " + e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
	
	static void test4() {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (NullPointerException e) {
			System.out.println("NullPointrException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}
	
	static void Finally() {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
			return;
		}
		finally {
			System.out.println(6);
		}
	}
	
	static void Sleep() {
		System.out.println("2초 동안 멈춥니다");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("종료합니다");
		
		Exception e = new Exception();
		e.getMessage();
	}
	
}
