package ch04_HomeWork;
import java.util.*;
public class Exercise07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean run = true;
		int balance = 0;

		while(run) {	//무한 반복
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 > ");

			int select = input.nextInt();	//메뉴 선택

			if(select == 1) {				//1번 선택시 입력한 금액 만큼 입금
				System.out.print("예금액 > ");
				int deposit = input.nextInt();
				balance += deposit;
			}
			else if(select == 2) {			//2번 선택시 입력한 금액 만큼 출금
				System.out.print("출금액 > ");
				int withdraw = input.nextInt();
				balance -= withdraw;
			}
			else if(select == 3) {			//3번 선택시 잔고 확인
				System.out.println("잔고 > "+ balance);
			}
			else if(select == 4) {			//4번 종료
				System.out.println("프로그램 종료");
				break;
			}


		}


	}

}
