package ch04;

import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		boolean stop = false;
		while(!stop) {
			count++;
			
			if(count%2 == 0) {
				continue;
			}
			System.out.println(count);
			if(count >= 10) {
				break;
			}
		}
		System.out.println("End");
	}

}
