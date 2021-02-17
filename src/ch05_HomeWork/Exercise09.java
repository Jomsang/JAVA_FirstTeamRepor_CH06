package ch05_HomeWork;
import java.util.*;
public class Exercise09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.접수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = input.nextInt();

			if(selectNo == 1) {
				System.out.print("학생수 > ");
				int count = input.nextInt();
				scores = new int[count];
			}
			else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores["+i+"]"+"> ");
					scores[i] = input.nextInt();
				}
			}
			else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"] "+scores[i]);
				}
			}
			else if(selectNo == 4) {
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				for(int i = 0; i < scores.length; i++) {

					if(max < scores[i]) {
						max = scores[i];

					}

					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println(sum);
				System.out.println("최고 점수 "+max);
				System.out.println("평균 점수 "+avg);
			}
			else if(selectNo == 5) {
				break;
			}

		}
		System.out.println("프로그램 종료");

	}

}
