package Class;
/*
 * 1. 모든 학생 정보 출력
 * 2. 평균 점수 구하기
 * 3. 최고 점수를 받은 학생의 정보 출력하기(1명)*/
class HStudent {
	String name;
	int studentID;
	int score;
	//생성자
	HStudent(String name, int studentID, int score) {
		this.name = name;
		this.studentID = studentID;
		this.score = score;
	}
	// 학생 정보 출력 메서드
	void printInfo() {
		System.out.println("이름: " + name + ", 학번: " + studentID + ", 점수: " + score);
	}
	// 점수 반환 메서드
	int getScore() {
		return score;
	}
}

public class HardStudent {
	public static void main(String[] args) {
		// 5명 학생 정보 생성
		HStudent[] students = {
				new HStudent("홍길동", 1001, 90),
				new HStudent("김철수", 1002, 85),
				new HStudent("이영희", 1003, 98),
				new HStudent("박민수", 1004, 76),
				new HStudent("최지우", 1005, 88),
		};
		
		int sum = 0;
		HStudent topStudent = students[0]; // 최고 점수 학생 추적용
		
		// 전체 정보 출력 + 합계 계산 + 최고 점수 추적
		for(int i =0; i < students.length; i++) {
			students[i].printInfo();
			sum += students[i].getScore();
			
			if(students[i].getScore() > topStudent.getScore()) {
				topStudent = students[i];
			}
		}
		
		// 평균 계산
		double average = (double)sum / students.length;
		
		//출력
		System.out.println();
		System.out.println("학생 평균 점수: " + String.format("%.2f", average));
		System.out.println("최고 점수 학생 정보: ");
		topStudent.printInfo();
				
			
	
	}
}
