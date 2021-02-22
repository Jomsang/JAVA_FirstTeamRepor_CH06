package ch08exam13;

public class Singleton {
	
	private static Singleton singleton = new Singleton();	//객체 생성과 무관, 정적필드를 선언
	
	
	
	
	private Singleton() {	//생성자를 직접 명시 , private를 해서 다른 클래스에서 new 를 사용해서 Singleton 객체를 생성 못 함.(보안을 위해서 이런 식으로도 활용)
		
	}
	
	static Singleton getInstance() {	//팩토리 메소드를 통해 Singleton을 사용 할 수 있음!
		//Singleton s = new Singleton();	//다른 객체가 생성
		
		//return s;
		return singleton;	//호출 할 때마다 같은 객체를 참조하게 하려면 필드에서 static필드로 객체를 선언 해줌.
	}
	//값을 바꿀 수 없는 필드를 final 필드
	
	//final 붙은 인스턴스 변수는 생성자를 통해서 딱 1번 바꿀 수 있는 기회를 줌.
	
	
	
	
	
}
