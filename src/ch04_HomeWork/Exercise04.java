package ch04_HomeWork;

public class Exercise04 {

	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		while(true) {	//무한 반복
			dice1 = (int) (Math.random() * 5);	//0 ~ 4 int형으로 random 숫자 호출
			dice2 = (int) (Math.random() * 5);
			System.out.println("("+ dice1 +", "+ dice2+")");
			if(dice1 + dice2 == 5) {	//dice1과 dice2의 합이 5이면 반복문 종료
				break;
			}
		}

	}

}
