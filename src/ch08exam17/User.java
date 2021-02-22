package ch08exam17;

public class User {
	//Field
	private String id;
	private String name;				//데이터의 무결성을 위해 private로 붙이고 게터와 세터를 만들어서 값을 읽고 써야 함.
										//메뉴 Source에 게터세터 세팅하면 자동완성 가능(제일 많이  사용 할 거임)
	private String password;
	private int age;
	private boolean adult;
	//메소드

	//setter
	public void setAge(int age) {//****중요하니 잘 알아두기 //private int age; 데이터의 무결성을 위해 접근 못 함
		if(age < 0) {				//게터와 세터 둘다 되면 쓰기와 읽기 둘다 가능 (나이는 수정 가능하니까, 비번은 보안이기때문에 저장만 가능)
			this.age = 0;
			
		}else {
			
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}
	
	
	public void setPassword(String password) {	//setter만 제공되면 저장만하고 읽지는 못함
		this.password = password;
	}
	//--------------------------------------------------------------------------------------------위에 지우라 햇는데 참고용으로 안 지움
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public boolean isAdult(boolean adult) { //boolean형을 리턴 하는 메소드는 메소드 이름 앞에 is를 붙여주는것이 관례
		return adult;
	}
	
	


}
