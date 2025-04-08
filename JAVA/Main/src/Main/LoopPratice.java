package Main;

// 반복문(for, while, do-while)
public class LoopPratice {
	public static void main(String[] args) {
		func2();
	}
	// 구구단 출력(2단~9단)
	static void func1() {
		for(int i=2; i<10; i++) {
			System.out.println("\n" + i + "단");
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}	
	}
	// 별찍기
	static void func2() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++ ) {
				System.out.print("*"); //println이 아닌 print로 출력해야 일자로 나오지 않는다.
			}
			System.out.println();
		}
	}
}
