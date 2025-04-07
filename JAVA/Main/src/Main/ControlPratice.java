package Main;

import java.util.Scanner;

// if문, switch문
public class ControlPratice {
	public static void main(String[] args) {
		func11();
	}
	//예제 1) of ~ else (짝수,홀수 판별기)
	static void func1() {
		System.out.println("정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
	/*
	 예제 2 ) if~ else if ~ else
	• 점수를 입력 받고 다음과 같이 학점을 출력하세요
	A 90 점 이상
	B 80 점 이상 90점 미만
	C 70점 이상 80점 미만
	D 60점 이상 70점 미만
	F 60점 미만*/
	static void func2() {
		System.out.println("학점을 입력하시오: ");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		} else if(score < 90 && score >= 80) {
			System.out.println("B");
		} else if(score < 80 && score >= 70) {
			System.out.println("C");
		} else if(score < 70 && score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
	//카드게임 메뉴선택 만들기
	static void func3() {
		System.out.println("카드 게임을 시작합니다. 원하는 메뉴를 선택하세요.");
		System.out.println("1. 카드를 섞습니다.");
		System.out.println("2. 모든 카드를 보여 줍니다.");
		System.out.println("3. 원하는 카드를 선택합니다.");
		System.out.println("4. 게임을 종료합니다.");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("카드 섞기를 선택했습니다.");
		} else if(menu == 2) {
			System.out.println("모든 카드 보기를 선택했습니다.");
		} else if(menu == 3) {
			System.out.println("카드 선택을 선택했습니다.");
		} else if(menu == 4) {
			System.out.println("게임을 종료합니다.");
		} else {
			System.out.println("오류입니다.");
		}
	}
	/* 하나의 정수를 입력 받아서 0보다 크고 100보다 작으면 입력값을 
	출력하고 그 외의 정수는 잘못된 입력이라고 출력*/
	static void func4() {
		System.out.println("정수를 입력해주세요(1~100): ");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number > 0 && number < 100) {
			System.out.println(number);
		} else {
			System.out.println("잘못된 입력");
		}
	}
	//소문자는 대문자로, 대문자는 소문자로 출력하는 코드를 완성하세요.
	static void func5() {
		System.out.println("변경할 문자를 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch = s.charAt(0);
		
		if(ch >= 'a' && ch <= 'z') {
			ch -= 'a' - 'A';
		}
		
		System.out.println("변경한 문자:" + ch);
	}
	//0 이상 100 이하의 정수에 대해서만 학점을 출력하도록 조건문을 중첩해서 구현하시오.(중첩조건문)
	static void func6() {
		System.out.println("점수를 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				System.out.println("A");
			} else if(score < 90 && score >= 80) {
				System.out.println("B");
			} else if(score < 80 && score >= 70) {
				System.out.println("C");
			} else if(score < 70 && score >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else {
			System.out.println("유효하지 않은 점수입니다.");
		}
	}
	// 사칙연산을 입력 받아 연산 결과를 출력하도록 switch 문으로 코드를 완성하세요
	static void func7() {
		int num1, num2, result;
		char op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번 째 수를 입력하세요");
		num1 = sc.nextInt();
		
		System.out.println("두번 째 수를 입력하세요");
		num2 = sc.nextInt();
		
		System.out.println("+, -, *, / 중 하나를 입력하세요");
		String str_op = (sc.next());
		op = str_op.charAt(0);
		/*👉 str_op 문자열에서 **첫 번째 문자(0번째 인덱스)**를 꺼내어 op에 저장한다.
		 op는 char 타입 변수여야 한다.*/
			switch(str_op) {
			case "+": 
				result = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + result);
				break;
			case "-":
				result = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			case "/":
				if(num1 != 0 && num2 != 0) {
					result = num1 / num2;
					System.out.println(num1 + " / " + num2 + " = " + result);
				} else {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				break;
		}		
	}
	static void func8() {
		int value2 = 8;
		switch(value2) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}
		System.out.println(); // 줄 바꿈
	}
	// func8() if 문으로 바꾸기
	static void func9() {
		int value2 = 8;
		if(value2 == 10) {
		}else if(value2 == 9) {
			System.out.println("A");
		}else if(value2 == 8) {
			System.out.println("B");
		}else if(value2 == 7) {
			System.out.println("C");
		}else if(value2 == 6) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		System.out.println();
	}
	// 점수를 입력 받아 학점을 출력하세요. switch 문을 사용합니다
	static void func10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요: ");
		int num = sc.nextInt();
		
		int result = num/10;
		
		switch(result) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		System.out.println();
	}
	// Math.random() 함수 활용 문제 (주사위 대결)
	static void func11() {
		int MyD = (int)(Math.random() * 6) + 1;
		int CD = (int)(Math.random() * 6) + 1;
		
		System.out.println("당신의 주사위: " + MyD);
		System.out.println("컴퓨터의 주사위: " + CD);
		
		if (MyD > CD) {
			System.out.println("당신이 이겼습니다!");
		} else if(MyD < CD) {
			System.out.println("당신이 패배했습니다..");
		} else {
			System.out.println("비겼습니다.");
		}
	}
}
