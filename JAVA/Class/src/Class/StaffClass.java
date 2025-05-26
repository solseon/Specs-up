package Class;

class Staff {
	String position;
	String name;
	double sallay;
	
	void Info() {
		System.out.println(name + " " + position + " " + sallay + "원");
	}
}
public class StaffClass {
	public static void main(String[] args) {
		Staff c1 = new Staff();
		Staff c2 = new Staff();
		Staff c3 = new Staff();
		
		c1.name = "김태희";
		c2.name = "차은우";
		c3.name = "소지섭";
		
		c1.position = "과장";
		c2.position = "대리";
		c3.position = "사원";
		
		c1.sallay = 3000000;
		c2.sallay = 2000000;
		c3.sallay = 1000000;
		
		c1.Info();
		c2.Info();
		c3.Info();
		
	}

}
