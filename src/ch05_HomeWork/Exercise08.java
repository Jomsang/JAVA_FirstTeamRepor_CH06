package ch05_HomeWork;

public class Exercise08 {

	public static void main(String[] args) {
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;			//평균 값을 구하기 위한 개수 
		int max = 0;
		for(int i = 0; i < array.length; i++) {		//array 배열 크기 읽기
			for(int j = 0; j < array[i].length; j++) { // array[i]의 크기 읽기
				sum += array[i][j];					//array 배열의 값들을 sum에 누적
				count++;							//누적 될때 마다 count 1씩 증가
				if(max < array[i][j]) {
					max = array[i][j];
				}
			}
		}
		avg = (double) sum /count;					//배열의 값들의 합을 개수로 나누어 평균을 구할 때 형변환 후 평균 값에 저장
		System.out.println("sum: "+ sum);
		System.out.println("avg: "+ avg);
		System.out.println("max: "+ max);

	}

}
