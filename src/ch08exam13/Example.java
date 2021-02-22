package ch08exam13;

public class Example {

	public static void main(String[] args) {
	
		//Singleton result44 = new Singleton();// 아래와 같은 객체 생성임! 하지만 new로 계속 생성하기 때문에 비효율적 , Singleton()클래스에서 private설정을 해줘서 오류남
		
		
		//전체 프로그램에서 딱 하나의 객체만 만들어서 공유해서 사용 할 때는 이게 중복성이 없고 훨씬 좋음
		Singleton result4 = Singleton.getInstance(); // 유용함 메소드의 리턴 값으로 객체를 지정해서도 사용 가능!!, "팩토리 메소드"라고 함
		Singleton result6 = Singleton.getInstance();
		if(result4 == result6) {
			System.out.println("같은 객체를 참조");
		}
		else {
			System.out.println("다른 객체를 참조");	//다른 참조임 왜냐하면 getInstance 메소드 안에서 부를 때 마다 객체를 생성하기 때문에 서로 다른 객체를 참조!
		}
		
		
		
	}

}
