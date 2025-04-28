package Main;

public class Pratice {
	public static void main(String[] args) {
		
	}
	
	static void func1() {
		// 같은 자료형 간의 연산
				int value1 = 3 + 5;
				int value2 = 8 / 5;
				float value3 = 3.0f + 5.0f;
				double value4 = 8.0 / 5.0;
				
				byte date1 = 3;
				byte date2 = 5;
				//byte value5 = date1 + date2;
				int value5 = date1 + date2;
				
				System.out.println(value1); //8
				System.out.println(value2); //1
				System.out.println(value3); //8.0
				System.out.println(value4); //1.3
				System.out.println(value5); //8
				System.out.println();
				
				//다른 자료형 간의 연산
				//int value6 = 5 + 3.5;
				double value6 = 5 + 3.5;
				int value7 = 5 + (int)3.5;
				
				double value8 = 5 / 2.0;
				byte date3 = 3;
				byte date4 = 5;
				int value9 = date3 + date4;
				double value10 = date3 + date4;
				
				System.out.println(value6); //8.5
				System.out.println(value7); //8
				System.out.println(value8); //2.5
				System.out.println(value9); //8
				System.out.println(value10); //8.0

	}
}
