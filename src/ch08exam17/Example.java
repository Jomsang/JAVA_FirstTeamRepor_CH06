package ch08exam17;

public class Example {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setAge(-10);
		u1.setPassword("12345");
		
		System.out.println(u1.getAge());
		//----------------------------------------
		u1.setAdult(true);
		
	}

}
