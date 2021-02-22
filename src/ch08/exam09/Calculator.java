package ch08.exam09;

public class Calculator { //객체마다 존재하는지, 공통된 것인지 잘 생각하기
	//필드
	static double PI = 3.14159;
	
	//생성자
	
	
	//메소드
	static void plus(int x, int y) {			//**인스턴스 필드를 사용 햇냐 안 햇냔에 따라 static 메소드 인지 아닌지 구별 가능
		int result = x + y;				//여기서는 인스턴스 필드가 없기 때문에 static 메소드로 가능
		System.out.println(result);
	}
}
