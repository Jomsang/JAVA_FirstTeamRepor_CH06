package ch04_HomeWork;

public class Exercise03 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {	//1-100 숫자중 홀수인 경우에만 sum에 누적 시킴
				sum += i;
			}
		}
		System.out.println("3의 배수의 합은 : "+ sum);
	}

}
