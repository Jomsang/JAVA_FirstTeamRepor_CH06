package ch04_HomeWork;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {			//i의 초기값 2에서 j= 1,2,3~ 9까지 완료 후 i++이 작동.
			System.out.println("*** "+i+"단 ***");
			for(int j = 1; j <= 9; j++) {				//j 초기값 1부터 9까지 "2*1 = 2" ~ 출력
				System.out.println(i+" X "+j+" = "+ i*j);
			}
		}

	}

}
