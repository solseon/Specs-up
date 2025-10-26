package Exception_handling;

public class OOP9_1_trycatch {
	public static void main(String[] args) throws InterruptedException {
		// 예외 발생시키기
		try {
			Exception e = new Exception("throw exception");
			throw e;
		} catch (Exception e) {
			System.out.println("error: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
		// 예제 2
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (NullPointerException ne) {
			System.out.println("NullPointerException");
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
		
		// Finally
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
			return; // return문을 만나도 finally문은 실행된다.
		}
		finally {
			System.out.println(6);
		}
		
		// Thread.sleep()을 try-catch 사용해서 바꾸기
//		 System.out.println("2초 동안 멈춥니다.");
//		 Thread.sleep(2000);
//		 System.out.println("종료합니다.");
		 
		System.out.println("2초 동안 멈춥니다.");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료합니다.");
		
	}
}
