package Collection_Framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class OOP9_1_Hash {
	public static void main(String[] args) {
		// HahSet 예제
		HashSet myset = new HashSet();
		myset.add(1);
		myset.add(3);
		myset.add(5);
		myset.add(1);
		System.out.println(myset.size());
		
		HashSet lotSet = new HashSet();
		Random rand = new Random();
		
		// 1부터 45 사이의 난수(정수)를 생성합니다. 
		// rand.nextInt(45)는 0부터 44까지의 수를 반환하므로, + 1을 더해 1부터 45로 범위를 조정합니다.
		while(lotSet.size() < 6) {
			int n = rand.nextInt(45) + 1;
			lotSet.add(n);
		}
		System.out.println(lotSet);
		
		// HashMap
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("apple", "사과");
		hm.put("banana", "바나나");
		hm.put("orange", "오렌지");
		
		System.out.println(hm.get("apple"));
		
		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(1, "apple");
		hm2.put(2, "banana");
		hm2.put(3, "orange");
		
		for(int i = 0; i < hm2.size(); i++) {
			System.out.println(i + 1 +", " + hm2.get(i+1));
		}
		
	}

}
