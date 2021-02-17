package ch04_HomeWork;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {	//짝수일 경우 가까운 반복문으로 돌아감.
				continue;
			}
			System.out.println(i);
		}

	}

}
