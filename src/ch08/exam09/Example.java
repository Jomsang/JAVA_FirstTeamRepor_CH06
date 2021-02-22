package ch08.exam09;

public class Example {

	public static void main(String[] args) {	//메인도 객체가 필요하지 않기 때문에 static이 붙음
		
		//올바른 사용 방법
		System.out.println(Calculator.PI);
		Calculator.plus(3, 5);
		
		//잘못된 사용 방법
		Calculator cal = new Calculator();
		System.out.println(cal.PI);
		cal.plus(3, 5);
	}

}
