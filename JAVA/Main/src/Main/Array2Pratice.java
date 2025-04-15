package Main;

import java.util.Arrays;

public class Array2Pratice {
	
	public static void main(String[] args) {
		func6();
	}
	// 점수의 총합, 평균 구하기
	static void func1() {
		int[][] score = new int[][] 
				{{90,85,70},
				 {60,75,80},
				 {95,100,85}};
		
		int sum = 0;
		int count = 0;
		
		for(int i =0; i < score.length; i++) {
			for(int j =0; j < score[i].length; j++ ) {
				sum += score[i][j];
				count++;
			}
		}
		double avr = (double)sum/count;
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + String.format("%.2f", avr));
	}
	// 각 행별로 평균 점수 구하기
	static void func2() {
		int[][] score = new int[][] 
				{{90,85,70},
				 {60,75,80},
				 {95,100,85}};
				 
		int sum1 = 0, count1 = 0;
		int sum2 = 0, count2 = 0;
		int sum3 = 0, count3 = 0;
		
		for(int i =0; i < score[0].length; i++) {
			sum1 += score[0][i];
			count1++;
		}
		
		for(int i=0; i < score[1].length; i++) {
			sum2 += score[1][i];
			count2++;
		}
		
		for(int i=0; i < score[2].length; i++) {
			sum3 += score[2][i];
			count3++;
		}
		double avr1 =(double)sum1/count1;
		double avr2 =(double)sum2/count2;
		double avr3 =(double)sum3/count3;
		
		System.out.println("1번째 학생 평균: " + String.format("%.2f", avr1));
		System.out.println("2번째 학생 평균: " + String.format("%.2f", avr2));
		System.out.println("3번째 학생 평균: " + String.format("%.2f", avr3));
	}
	// 위에 문제 더 깔끔한 버전 (더 좋음)
	static void func3() {
		int[][] score = new int[][] 
				{{90,85,70},
				 {60,75,80},
				 {95,100,85}};
				 
		for(int i =0; i < score.length; i++) {
			int sum = 0; // sum 초기화
			for(int j =0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			double avr = (double) sum/score[i].length;
			System.out.println((i+1) + "번쨰 학생 평균: " + String.format("%.2f", avr));
		}
	}
	// 반 평균과 최고 점수 구하기
	static void func4() {
		int[][] score = new int[][] 
				{{80,90,85},
				 {70,60,75},
				 {90,95,100},
				 {60,70,65}};
		
		// 국어, 수학, 영어 리스트 생성
		int[] kor = new int[4];		
		int[] math = new int[4];
		int[] eng = new int[4];
		
		for(int i =0; i < kor.length; i++) {
			kor[i] = score[i][0];
		}
		for(int i =0; i < math.length; i++) {
			math[i] = score[i][1];
		}
		for(int i =0; i < eng.length; i++) {
			eng[i] = score[i][2];
		}
		
		int korsum = 0;
		int mathsum = 0;
		int engsum = 0;
		
		for(int i=0; i < kor.length; i++) {
			korsum += kor[i];
		}
		for(int i=0; i < math.length; i++) {
			mathsum += math[i];
		}
		for(int i=0; i < eng.length; i++) {
			engsum += eng[i];
		}
		
		double koravr = (double) korsum/kor.length;
		double mathavr = (double) mathsum/kor.length;
		double engavr = (double) engsum/kor.length;
		
		int kormax = 0;
		int mathmax = 0;
		int engmax = 0;
		
		for(int i=0; i < kor.length; i++) {
			if(kormax < kor[i]) {
				kormax = kor[i];
			}
		}
		for(int i=0; i < math.length; i++) {
			if(mathmax < math[i]) {
				mathmax = math[i];
			}
		}
		for(int i=0; i < eng.length; i++) {
			if(engmax < eng[i]) {
				engmax = eng[i];
			}
		}
		
		System.out.println("국어 평균: " + String.format("%.2f", koravr) + ", 최고점: " + kormax);
		System.out.println("수학 평균: " + String.format("%.2f", mathavr) + ", 최고점: " + mathmax);
		System.out.println("영어 평균: " + String.format("%.2f", engavr) + ", 최고점: " + engmax);
	}
	// 위에 문제 더 간결하게 하기 코드 수 줄이기
	static void func5() {
		int[][] score = {
	            {80, 90, 85},
	            {70, 60, 75},
	            {90, 95, 100},
	            {60, 70, 65}
	        };

	        int korsum = 0, mathsum = 0, engsum = 0;
	        int kormax = 0, mathmax = 0, engmax = 0;

	        for (int i = 0; i < score.length; i++) {
	            int kor = score[i][0];
	            int math = score[i][1];
	            int eng = score[i][2];

	            korsum += kor;
	            mathsum += math;
	            engsum += eng;

	            if (kor > kormax) kormax = kor;
	            if (math > mathmax) mathmax = math;
	            if (eng > engmax) engmax = eng;
	        }

	        double koravr = (double) korsum / score.length;
	        double mathavr = (double) mathsum / score.length;
	        double engavr = (double) engsum / score.length;

	        System.out.println("국어 평균: " + String.format("%.2f", koravr) + ", 최고점: " + kormax);
	        System.out.println("수학 평균: " + String.format("%.2f", mathavr) + ", 최고점: " + mathmax);
	        System.out.println("영어 평균: " + String.format("%.2f", engavr) + ", 최고점: " + engmax);
	    }
	// 진상훈 버전
		static void func6() {
			int[][] score = {
					{80,90,85},
					{70,60,75},
					{90,95,100},
					{60,70,65}
			};
			
			int maxScore[] = new int[3];
			float avgScore[] = new float[3];
			String type[] = {
					"국어",
					"수학",
					"영어"
			};
			
			for(int i =0; i <3; i++) {
				float sum = 0;
				for(int v=0; v<4; v++ ) {
					sum += score[v][i];
					if(maxScore[i] < score[v][i]) {
						maxScore[i] = score[v][i];
					}
				}
				avgScore[i] = sum/4;
			}
			
			for(int i=0; i <3; i++) {
				System.out.printf("%s평균: %.2f, 최고점: %d\n", type[i], avgScore[i], maxScore[i]);
			}
		}
		// 학생별 총점과 반 등수 출력하기
		static void func7() {
			int[][] score = {
					{80, 90, 85},
					{70, 60, 75},
					{90, 95, 100},
					{60, 70, 65}
			};
		}
	}

