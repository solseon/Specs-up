package Class;
/*
 * 1.모든 직원 정보 출력
 * 2.전체 급여의 평균 출력
 * 3.가장 높은 급여를 받은 직원 정보 출력*/
class Employee {
	String name; // 이름
	int employeeID; // 사번
	int salary; // 급여
	// 생성자
	Employee(String name, int employeeID, int salary) {
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
	}
	// 이름, 사번, 급여 출력
	void printInfo() {
		System.out.println("이름: " + name + ", 사번: " + employeeID + ", 급여: " + salary);
	}
	// 급여 반환
	int getSalary() {
		return salary;
	}
}


public class EmployeeClass {
	public static void main(String[] args) {
		Employee[] employees = {
				new Employee("이민호", 101, 3500000),
				new Employee("박서준", 102, 4000000),
				new Employee("김태희", 103, 4200000),
				new Employee("정해인", 104, 3000000),
				new Employee("수지", 105, 3800000)
		};
		
		int sum = 0;
		Employee topSalary = employees[0];
		
		for(int i = 0; i < employees.length; i++) {
			employees[i].printInfo();
			sum += employees[i].getSalary();
			
			if(topSalary.getSalary() < employees[i].getSalary()) {
				topSalary = employees[i];
			}
			
		}
	
		double average = (double) sum / employees.length;
		
		System.out.println();
		System.out.println("직원 평균 급여: " + String.format("%.2f", average));
		System.out.println("최고 급여 직원 정보: ");
		topSalary.printInfo();
		
	
		
		
		
		
		
		
		
	}
}
