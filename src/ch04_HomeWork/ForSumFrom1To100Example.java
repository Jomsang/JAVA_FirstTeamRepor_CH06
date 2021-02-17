package ch04_HomeWork;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(i = 1; i <= 100; i++) {
			sum += i;					//sum 변수에 100까지의 값이 더해짐.
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		System.out.println("1부터 " + (i-1) + "까지의 합 : " + sum);
	}

}
