package ch05_HomeWork;

public class Exercise07 {

	public static void main(String[] args) {

		int [] array = {1, 5, 3, 8, 2};

		int max = 0;

		for(int i = 0; i < array.length; i++) {		//처음에 array배열[0] 값 읽음
			for(int j = 0; j < array.length; j++) {	//array[0]값을 기준으로 array[j] 증가하면서 비교
				if(array[i] < array[j]) {			//첫번째 값보다 다음 값이 클 경우 정렬해줌
					max = array[j];
					array[j] = array[i];
					array[i] = max;
				}
			}
		}
		System.out.println("max "+ max);


	}

}
