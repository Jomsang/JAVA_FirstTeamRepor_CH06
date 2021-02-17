package ch04;

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >= 1; j--) {
				if(i < j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			for(int k = 2; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		

	}

}
