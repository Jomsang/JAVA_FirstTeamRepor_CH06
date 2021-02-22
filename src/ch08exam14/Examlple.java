package ch08exam14;

public class Examlple {

	public static void main(String[] args) {
		// Korean.NATION = "미국"; (NATION은 final이기 때문에 값을 바꿔주면 오류)
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234567");//final String ssn 에 감
		// k1.ssn = "3132131"; 위 생성자에서 이미 줬기 대문에 바꾸려하면 오류 남(한 번주고 안 바꾸는 상황일 때는 생성자에서 값음 줌)
		// Math.PI; Math클래스에 있는 static final변수 PI를 부름.
		double area = 10 * 10 * Math.PI;
		
		
		
		
	}

}
