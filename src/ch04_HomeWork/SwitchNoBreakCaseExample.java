package ch04_HomeWork;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8;	//0시 ~ 12시 즉 시간 값 출력을 위해 random 사용
		System.out.println("[현재시간: "+time+" 시]");

		switch(time) {
		case 8:				
			System.out.println("출근합니다");	//time에 8이 저장 될 경우 
		case 9:
			System.out.println("회의를 합니다");
		case 10:
			System.out.println("업무를 봅니다");
		default:
			System.out.println("외근을 나갑니다");
		}

	}

}
