package ch04_HomeWork;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;	//sum 값 저장을 위해 초기에 0으로 저장.

		while(i <= 100) {

			sum += i;  //1부터 100까지 sum에 누적
			i++;

		}

		System.out.println("1~" + (i-1) +"합 : "+sum);

	}

}
