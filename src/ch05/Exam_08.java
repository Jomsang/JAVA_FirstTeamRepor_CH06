package ch05;

import java.util.Arrays;

public class Exam_08 {

	public static void main(String[] args) {
		int[][] scores = {
				{80, 75},
				{90, 85, 87},
				{45, 55, 65, 75}
		};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[2].length);

		int sum = 0;
		/*for(int i = 0; i < scores.length; i++) {
			int []ban = scores[i];
			for(int k = 0; k < ban.length; k++ ) {
				sum += ban[k];
			}
			
		}
		*/
		int count = 0;
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				count++;
			}
		}
		double avg = sum / count;
		System.out.println(sum);
		System.out.println(avg);


	}


}
