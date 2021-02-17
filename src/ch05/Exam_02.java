package ch05;

import java.util.Arrays;

public class Exam_02 {

	public static void main(String[] args) {
		//변수를 선언하면서 값 목록을 제공할 경우
		int[] scores1 = {90, 85, 87};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);

		
		//변수를 선언한 후 값 목록을 제공할 경우
		int[] scores2 = null; 
		scores2 = new int[] {90, 85, 87}; // scores2 = new int[] {90, 85, 87};  -이렇게 선언해야 사용 가능

		add(scores1); //메소드 호출
		//call by references - '번지'를 전달하면서 add 메소드를 호출     //call by value - '값'을 전달하면서 add 메소드를 호출하겠다!
		add(scores2);
		//add({100, 200, 300});  - 안 됨. add메소드에 매개변수 int[] arr를 선언했기때문.
		add(new int[] {100, 200, 300}); // 이렇게 형식을 같이 줘야 선언 가능
		
	}
	public static void add(int[] arr) { //메소드 선언
		System.out.println("값: "+ Arrays.toString(arr));
	}

}
