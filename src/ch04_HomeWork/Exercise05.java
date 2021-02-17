package ch04_HomeWork;

public class Exercise05 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		for(x = 1; x <= 10; x++) {		//1 ~ 10이하의 x,y for문 선언
			for(y = 1; y <= 10; y++) {
				if(4 * x + 5 * y == 60) {	//4x + 5y = 60의 식에서 x, y에 1-10 까지 대입 후 만족하는 수를 출력
					System.out.println("("+ x +", "+ y +")");
				}
			}
		}

	}

}
