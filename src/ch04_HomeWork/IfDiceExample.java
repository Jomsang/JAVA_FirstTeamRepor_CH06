package ch04_HomeWork;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1; // 0 ~ 7미만의 수를 int 형으로 형변환 후 저장.

		if (num == 1) { // 만약 랜덤으로 1이 나올 경우.
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else { // 위 if-else if문에 해당하지 않을 경우 else를 6번 출력으로 대체
			System.out.println("6번이 나왔습니다.");
		}
	}

}
