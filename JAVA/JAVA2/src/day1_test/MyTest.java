package day1_test;

import java.util.Scanner;

// Staff 클래스
 class Staff {
	String name;
	String position;
	double salary;

	//생성자
	Staff(String name, String position, double salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	String Info() {
		return name + " "+ position + " " + String.format("%,.0f원", salary);
	}
	
	void changePosition(String position) {
		this.position = position;
	}
	
	 double getSalary() {
		return salary;
	}
}
public class MyTest {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4번과 5번을 선택하세요");
		
		int number = sc.nextInt();
		
		if(number == 4) {
			Staff s[] = new Staff[3];
			
			s[0] = new Staff("장원영", "과장", 3000000);
			s[1] = new Staff("차은우", "대리", 2000000);
			s[2] = new Staff("변우석", "사원", 1000000);
			
			
			for(int i=0; i < 3; i++) {
				s[i].Info();
			}
		} else if (number == 5) {
			double total = 0;
			for(int i=0; i < 3; i++) {
			
			}
			
		}
		
		
		
		
	}
	
}
