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
		return position + " " + name + " " + String.format("%,.0f원", salary);
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
		Staff s[] = new Staff[3];
		Scanner sc = new Scanner(System.in);
		
		s[0] = new Staff("장원영", "과장", 3000000);
		s[1] = new Staff("차은우", "대리", 2000000);
		s[2] = new Staff("변우석", "사원", 1000000);
		
		int number = 0;
		
		System.out.println("4번과 5번을 선택하세요");
		number = sc.nextInt();
		
		if(number == 4) {
			for (Staff staff : s) {
				System.out.println(staff.Info());
			}
		} 
		else if (number == 5) {
			double total = 0;
			for (Staff staff : s) {
				total += staff.getSalary();
		}
		System.out.println("모든 직원들의 급여의 합 : " + String.format("%,.0f원", total));
	  }
	}
}
