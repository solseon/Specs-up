package Main;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPratice {
	
	public static void main(String[] args) {
		func10();
	}
	
	static void func1() {
		//배열의 선언 방법1
		// 자료형 뒤에[] 표기
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		//배열의 선언 방법2
		// 변수명 뒤에[] 표기
		int array3[] = new int[3];
		int array4[];
		array4 = new int[3];
		
		// 다양한 배열 선언(기본 자료형 배열, 참조 자료형 배열)
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];
		
		// 배열 객체 생성과 함께 값 대입하기
		int a[] = new int[] {3,4,5}; // 배열의 길이는 값의 갯수로 결정
		
		int b[] = {3,4,5};
		
		// 1차원 배열의 원소 값 대입의 방법
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		int array9[] = new int[] {3,4,5};
		System.out.println(array9[0] + " " + array9[1] + " " + array9[2]);
	}
	// 10개의 정수를 저장할 수 있는 배열을 만들고, 반복문을 사용해 1부터 10까지 저장하시오.
	static void func2() {
		int[] a = new int[10];
		
		for(int i=0; i <= 9; i++) {
			a[i] = i+1;
			System.out.print(a[i] + " ");
		}
	}
	
	static void func3() {
		int[] num = new int[] {100,88,100,100,90};
		int sum = 0;
		
		for(int i=0; i < num.length; i++) {
			sum += num[i];
		}
		float avr = (float)sum/num.length; // num 배열의 길이 만큼 나눠줌 == allnum/5;와 같음
		System.out.println("총점: "+ sum + ", " + "평균: " + avr);
	}
	//길이가 5인 정수형 배열에 사용자로부터 값을 입력받아 초기화하고 이 중 가장 큰 값을 출력
	static void func4() {
		int[] in = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열에 저장할 값 5개를 입력해주세요: ");
		
		for(int i=0; i < 5; i++) {
			in[i] = sc.nextInt();
		}
		
		int max = in[0];
		for(int i=1; i < in.length; i++) {
			if(in[i] > max) {
				max = in[i];
			}
		}
		System.out.println(Arrays.toString(in)); // 배열을 보여주기
		System.out.println("최댓값: " + max);
	}
	//"79, 88, 91, 33, 100, 55, 95"로 초기화한 정수 배열에서 최대값, 최소값 구하기
	static void func5() {
		int[] array = new int[] {79,88,91,33,100,55,95};
		int max = array[0];
		int min = array[0];
		
		for(int i=1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			
			if(min > array[i]) {
				min = array[i];
			}
		} 
		System.out.println("최댓값: " + max + " 최솟값: " + min);
	}
	//정수 길이가 10인 정수형 배열을 만들고 1부터 45까지의 난수를 저장하고 출력하세요 (중복허용)
	static void func6() {
		int[] array = new int[10];
		
		for(int i=0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 45) + 1;
			System.out.print(array[i] + " ");
		}
	}
	//1부터 10까지의 중복되지 않은 정수 10개를 출력하세요 (정렬되지 않은 섞여있는 형태, 5, 9, 4, 10...)
	static void func7() {
		// 크기 10짜리 number배열 선언과 1~10까지 배열에 저장
		int[] number = new int[10];
		for(int i=0; i < number.length; i++) {
			number[i] = i + 1;
		}
		
		int j = 0, temp = 0;
		for(int i = 0; i < 100; i++) {
			j = (int)(Math.random() * 10);
			temp = number[j];
			number[j] = number[0];
			number[0] = temp;
		}
		
		for(int i=0; i < number.length; i++) {
			System.out.print(number[i] + ", ");
		}
	}
	/*
	 * 정수를 저장하는 길이가 10인 배열을 만들고 다음과 같이 초기화하세요
	 * 40, 25, -1, 8, 76, 9 */
	static void func8() {
		int[] array = new int[10];
		
		array[0] = 40;
		array[1] = 25;
		array[2] = -1;
		array[3] = 8;
		array[4] = 76;
		array[5] = 9;
		
		// 배열에서 반복문과 continue를 사용해 짝수만 출력하세요
		for(int i=0; i < array.length; i++) {
			if(array[i] % 2 != 0) { //홀수 체크
				continue; // 홀수는 건너뛰기
			}
			System.out.println(array[i]);
		}
		
		// 배열에서 반복문과 break를 사용해 배열 요소의 값이 0이면 반복문을 빠져나와 그 때의 인덱스를 출력하세요
		for(int i=0; i < array.length; i++) {
			if(array[i] == 0) {
				System.out.println("값이 0인 인덱스: " + i);
				break;
			}
		}
	}
	//char 데이터를 저장할 길이 10의 배열을 만들고, 소문자 'a'부터 'j'까지 저장하세요
	static void func9() {
		char[] aj = new char[] {'a','b','c','d','e','f','g','h','i','j'};
		
		System.out.println(Arrays.toString(aj));
		
	}
	//1부터 45까지의 수 6개를 출력하세요 (로또번호발생기)
	static void func10() {
		int[] num = new int[6];
		int t = 0;
		
		while(num[5] == 0) {
			num[t] = (int)(Math.random() * 45) +1;
			for(int i=0; i < t; i++) {
				if(num[t] == num[i]) {
					num[t] = 0;
					t--;
					continue;
				} 
			}
			t++;
		}
		System.out.print(Arrays.toString(num));

	}
	//로또번호발생기(bool배열 풀이)
	static void func11() {
		
	}
}
