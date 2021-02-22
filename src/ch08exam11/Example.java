package ch08exam11;

public class Example {

	public static void main(String[] args) {
		//필드는 데이타, 메소드는 코드 덩어리(객체마다 메소드도 따로 있으면 매우 비효율적) 그래서 필드는 힙영역에 있지만 메소드는 메소드 영역이 따로 있음.
		User user = new User("조민상");	// - 객체를 생성(힙에 생김) 변수는 번지를 갖고 있음
		
		//인스턴ㅅ느 멤버(필드, 메소드)는 반드시 
		//객체 참조 변수를 통해서 접근(user 변수)
		
		System.out.println(user.name);
		user.login();
		user.logout();
		
		user.info();				//static 메소드를 객체를 사용해서 쓰면 사용은 가능하나 경고가 뜸
		System.out.println(User.nation);
		User.info();	//객체 없이도 정적 멤버(static이 붙은 필드 및 메소드) 들은 사용가능
	}

}
