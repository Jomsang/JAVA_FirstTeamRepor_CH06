package ch08exam16pack1;

public class Car {
	//필드
	public String model;	//default 접근제어자 (같은 패키지에서만 사용 가능) public이 붙으면 다른 패키지에서 접근 가능
	
	//생성자
	
	 public Car(){	//지정 안해도(생략 할 때) 자동으로 컴파일러가 public을 붙여줌 객체 생성 할때 new 하고 하면 되는거 생각하면 됨
		
	}
	
	//메소드
	public void run() {
		System.out.println("달려 달려~!");
	}
	
}
