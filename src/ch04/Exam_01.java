package ch04;

import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a < b) {
			
			System.out.println(b);
			
		} else if (a > b) {
			
			System.out.println(a);
			
		} else {
			
			System.out.println(c);
		}
		
		
		
	}

}
