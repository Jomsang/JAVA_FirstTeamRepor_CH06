package ch04;

import java.util.*;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();

		switch (a) {
		case "A":
			System.out.println("Would you like something to drink?");
			break;
		case "B":
			System.out.println("Do you Hungry?.");
			break;

		default:
			System.out.println("Don't care");

		}
		// ----------------------------------
		
		if (a.equals("A")) {
			System.out.println("Would you like something to drink?");
		} else if (a.equals("B")) {
			System.out.println("Do you Hungry?.");
		} else {
			System.out.println("Don't care");
		}

	}

}