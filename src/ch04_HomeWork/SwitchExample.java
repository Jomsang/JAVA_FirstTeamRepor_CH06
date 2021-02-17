package ch04_HomeWork;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;	//1부터 6까지 정수를 num에 저장.

		switch(num) {							//switch문에 변수가 num을 줌.
		case 1:	//num에 1이 저장 될 경우.								
			System.out.println("1번이 나왔습니다.");
			break;
		case 2: //num에 2가 저장 될 경우.
			System.out.println("2번이 나왔습니다.");
			break;
		case 3: //num에 3이 저장 될 경우.
			System.out.println("3번이 나왔습니다.");
			break;
		case 4: //num에 4가 저장 될 경우.
			System.out.println("4번이 나왔습니다.");
			break;
		case 5: //num에 5가 저장 될 경우.
			System.out.println("5번이 나왔습니다.");
			break;
		default://남은 6이 저장될 경우 default 값으로 설정.
			System.out.println("6번이 나왔습니다.");
			break;
		}
	}

}
