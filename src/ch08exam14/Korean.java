package ch08exam14;

public class Korean {	//도큐먼트를 사용하기 위한 연습이라 생각하면 됨.
	//필드
	static final String NATION = "한국";	//아예 못 바꿈.(final static을 사용하면 변수명을 대문자를 사용하는것이 관례) static이 붙으면 객체와는 상관 없음
	final String ssn; // 주민번호 - 사람마다 다르기 때문에 인스턴스로, 근데 한 명당 하나의 값이기 때문에 final로 선언, 근데 이렇게만 하면 오류가 나서 생성자에서 !!딱 1번만 줄 수 있음!!!
	//생성자
	Korean(String ssn){
		this.ssn = ssn;
	}
	//메소드
	
}
