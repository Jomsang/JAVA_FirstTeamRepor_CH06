package ch04;

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		while(true) {
			System.out.println("ют╥б : ");
			int x = Integer.parseInt(input.nextLine()) ;
			
			double q = Double.parseDouble(input.nextLine()) ;
			
			int y = Integer.parseInt(input.nextLine()) ;
			
			int z = Integer.parseInt(input.nextLine()) ;

			
			System.out.println(x+y+z+q);
			break;
			
		}


	}
}
