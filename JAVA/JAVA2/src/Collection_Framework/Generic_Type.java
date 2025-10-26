package Collection_Framework;

public class Generic_Type {
	public static void main(String[] args) {
		MyTest t1 = new MyTest<Integer>(1);
		MyTest t2 = new MyTest<String>("hello");
		
		t1.printInfo();
		t2.printInfo();
		
		// 알아두세요 꼭
		int[] numbers = {1,2,3,4,5};
		
		// for-each 반복문을 사용하여 배열의 모든 요소를 순회합니다.
		for(int num : numbers) {
			System.out.println("Element: " + num);
		}
	}
}

// 제네릭 클래스
class MyTest<T> {
	T a;
	MyTest(T a){
		this.a = a;
	}
	void printInfo() {
		System.out.println(a);
	}
	
	// 제네릭 메서드
	void method2() {
		genericMethod(1);
		genericMethod("jennifer");
	}

	<T> void genericMethod(T a) {
		System.out.println(a);
	}
}

