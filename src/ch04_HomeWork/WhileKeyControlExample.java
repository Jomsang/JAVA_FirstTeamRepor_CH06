package ch04_HomeWork;

public class WhileKeyControlExample {

	public static void main(String[] args) {

		boolean run = true;	
		int speed = 0;
		int keyCode = 0;

		while(run) {	//true인 이상 무한 반복
			if(keyCode != 13 && keyCode != 10) {	//13과 10이 입력되면 if문을 벗어남.
				System.out.println("=====================");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("=====================");
				System.out.println("선택 : ");
			}

			try {									//Exception 처리
				keyCode = System.in.read();
			}catch(Exception e){
				e.printStackTrace();
			}

			if(keyCode == 49) {	//1(49)이 입력되면 speed 증가
				speed++;
				System.out.println("현재 속도 = "+ speed);
			}
			else if(keyCode == 50) { //2(50)이 입력되면 speed 감소
				speed--;
				System.out.println("현재 속도 = "+ speed);
			}
			else if(keyCode == 51) {	//3(51)이 입력되면 종료
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

}
