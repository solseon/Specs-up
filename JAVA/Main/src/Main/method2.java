package Main;

import java.util.Arrays;

//참조 자료형 매개변숫값의 변화
public class method2 {
	public static void main(String[] args) {
		int[] array = new  int[] {1,2,3};
		modifyDate(array);
		printArray(array);
		
	}
	public static void modifyDate(int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
