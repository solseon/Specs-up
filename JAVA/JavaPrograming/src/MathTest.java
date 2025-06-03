import java.util.Scanner;

public class MathTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("두 수의 합:" + Math.add(a, b));
		System.out.println("두 수의 합:" + Math.sub(a, b));
				
	}
}
