package ch04_HomeWork;

public class IfExample {

	public static void main(String[] args) {
		int score = 93; // 정수 데이터 타입 int 형 변수 선언 후. 정수 93 저장

		if (score >= 90) { // 만약 score가 90 이상일 경우
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다");

		}
		if (score < 90) // 만약 score가 90 미만일 경우
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B 입니다.");

	}

}
