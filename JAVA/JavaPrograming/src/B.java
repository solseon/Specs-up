
public class B {
	int a;
	static int b;
	
	void aaa() {
		a = 3;
		b = 4;
		bbb();
		ccc();
		
	}
	
	static void bbb() {
//		a = 3; 인스턴스 멤버변수라 안됨
		b = 5;
		ccc();
	}
	
	static void ccc() {
		b = 5;
//		aaa();	함수에 static가 안 붙어서 안됨
		bbb();
	
	}
}
