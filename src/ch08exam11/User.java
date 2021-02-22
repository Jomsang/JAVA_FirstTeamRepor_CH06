package ch08exam11;

public class User {
	//Filed
	String id;
	String name;
	String password;		//인스턴스 필드를 선언 (객체 안에 들어갈 놈들) - 객체가 존재해야 사용 가능, 객체마다 값이 다르기 때문에 변수 만 선안
	static String nation = "대한민국";		//static 변수이기 때문에 값을 줘도되고 안줘도됨
	//Constructor - 인스턴스의 멤버가 될 수 없음(객체를 생성하기위한 용도일 뿐, 인스턴스가 될수 없음 EX new Calculator() - 이 부분을 불러오기 띠ㅐ문에;
	
	User(String name){
		this.name = name;
	}
	
	
	
	//method
	void login() {
		System.out.println(name +" 님이 로그인 합니다");
	}
	void logout() {
		System.out.println(name +" 님이 로그아웃 합니다");
	}												//인스턴스 메소드, 객체가 있어야 사용 가능 login,logout 메소드는 객체가 있어야 사용이 가능 (name을 사용하기 때문에)
	
	static void info() {									//객체 없이도 사용 가능
		System.out.println("모든 User는 한국인입니다.");
	}
}
