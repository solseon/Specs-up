package Class;

class Student {
	String name;
	int ban,no,kor,eng,math;
	
	Student() {
		
	}
	
	void setScore(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
	}
	int  getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return getTotal()/3F;
	}
	
	void showInfo() {
		System.out.println("이름:" + name + " " + ban +"반 "+ no + "번");
		System.out.println("총점: " + getTotal() + " 평균: " + 
							String.format("%.2f", getAverage()));
	}
}

public class StudentClass {
		public static void main(String[] args) {
			Student s1 = new Student();
			s1.name = "안수범";
			s1.ban = 3;
			s1.no = 31;
			s1.kor = 98;
			s1.eng = 89;
			s1.math = 90;
			s1.showInfo();
			
		}
}
