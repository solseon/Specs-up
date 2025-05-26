package Class;

class Income {
	String item;	// 항목
	double income;	// 수입금액
	
	double getIncome() { // 수입금액을 반환
		return income;
	}
}

public class IncomeClass {
	public static void main(String[] args) {

		Income arr[] = new Income[5];
		arr[0] = new Income();
		arr[0].item = "주식";
		arr[0].income = 5000;
		
		arr[1] = new Income();
		arr[1].item = "일당";
		arr[1].income = 100000;
		
		arr[2] = new Income();
		arr[2].item = "유투브";
		arr[2].income = 500;
		
		arr[3] = new Income();
		arr[3].item = "이자";
		arr[3].income = 1000;
		
		arr[4] = new Income();
		arr[4].item = "용돈";
		arr[4].income = 10000;
		
		double totalincome  = 0;
		
		for(int i = 0; i < arr.length; i++) {
			totalincome += arr[i].getIncome();
		}
		
		System.out.println("총 수입: " + totalincome + "원");
	}
}
