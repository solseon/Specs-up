package Class;

import java.util.Scanner;

class Student {
	String name;
	int kor, eng, math;
	
	// 매개변수가 있는 생성자
	Student(String name) {
		this.name = name;
		kor = eng = math = -1; // 미입력 점수는 0점이 아닌 오류임을 알기위해
	}
	
	void setScore(int kor,  int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		
		if(kor<0 || eng <0 || math<0) {
			System.out.println("점수 입력 오류로 총점 계산 불가");
			return -1;
		}
		return kor + eng + math; 
	}
	
	double getAvg() {
		
		if(kor<0 || eng <0 || math<0) {
			System.out.println("점수 입력 오류로 평 계산 불가");
			return -1;
		}
		
		double avg = getTotal()/3.0;
		avg = (int)(avg *100 + 0.5)/100.0;	// 셋째 자리 반올림 하는 과정
		
		return avg;
	}
	
	void printInfo() {
		
		if(kor<0 || eng <0 || math<0) {
			System.out.println("점수 입력 오류로 총점 계산 불가");
			return;
		}
		
		System.out.println(name + "의 평균은 " + getAvg() + "입니다.");
	}
}

public class StudentClass {
		public static void main(String[] args) {
				// 배열의 주소에 객체를 저장하는법
			Student[] arr = new Student[3];
			arr[0] = new Student("안수범");
			arr[0].setScore(100, 90, 80);
			arr[0].printInfo();
			
			// 객체 생성
			Student s = new Student("안수범");
			s.setScore(100, 90, 80);
			s.printInfo();
			
			// 사용자에게 점수 입력받아 배열에 넣고 출력하기
			Scanner sc = new Scanner(System.in);
			
			Student[] arr2 = new Student[3];
			for(int i=0; i < arr.length; i++) {
				System.out.println("학생이름: ");
				String name = sc.next();
				arr[i] = new Student(name);
				
				System.out.println("국어 점수: ");
				int k = sc.nextInt();
				System.out.println("영어 점수: ");
				int e = sc.nextInt();
				System.out.println("수학 점수: ");
				int m = sc.nextInt();
				
				arr[i].setScore(k, e, m);
			}
			
			System.out.println("입력한 모든 학생의 평균 출력");
			
			for(int i =0 ; i <arr.length; i++) {
				arr[i].printInfo();
			}
		}
}
