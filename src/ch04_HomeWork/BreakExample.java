package ch04_HomeWork;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {									//무한 반복
			int num = (int) (Math.random() * 6) + 1;	//0~6 정수 랜덤 저장
			System.out.println(num);
			if(num == 6) {								//6이 나올 경우 가장 가까운 반복문을 종료.
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
