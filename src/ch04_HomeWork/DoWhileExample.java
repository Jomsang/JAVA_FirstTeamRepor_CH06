package ch04_HomeWork;
import java.util.*;
public class DoWhileExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("메세지를 입력하시오.");
		System.out.println("프로그램을 종료하려면 q를 입력하시오.");

		String inputString;

		do {							//do-while문은 무조건 한 번은 실행.
			System.out.println(">");
			inputString = input.nextLine();	//문자열 직접 입력
			System.out.println(inputString);
		}while(! inputString.equals("q"));	//"q"가 입력되면 do-while문 벗어남.

		System.out.println();
		System.out.println("프로그램 종료");
	}

}
