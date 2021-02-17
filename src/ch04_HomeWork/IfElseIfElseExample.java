package ch04_HomeWork;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;

		if (score >= 90) { // 만약 score가 90 이상일 경우
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다");

		} else if (score >= 80) { // 만약 score가 80 이상일 경우
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다");
		} else if (score >= 70) { // 만약 score가 70 이상일 경우
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다");
		}

		else { // 위 if ~ else if가 해당 안할 경우

			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}

	}

}
