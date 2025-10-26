package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OOP9_1_ArrayList {
	public static void main(String[] args) {
		
		// ArrayList 사용예
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		
		System.out.println(al.get(0)); // 0번째 인덱스의 객체 반환 = 1
		int size = al.size(); // size에 배열 크기 넣기 = 2
		System.out.println(size);
		al.clear(); // al배열 다 비우기 크기 0
		size = al.size();
		System.out.println(size);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수를 입력하세요 (0 입력시 종료): ");
			
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			numbers.add(num);
		}
		
		int sum = 0;
		for(int num : numbers) {
			sum += num; //numbers.get(num);
		}
		
		System.out.println("입력한 숫자들: " + numbers);
		System.out.println("총합: " + sum);
		
		// Iterator
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			al2.add(i+1);
		}
		
		// Iterator를 사용하여 ArrayList의 모든 원소를 순회
		Iterator<Integer> iterator = al2.iterator();
		
		while(iterator.hasNext()) {
			int element = iterator.next();
			System.out.println("Element: " + element);
		}
	}
}
