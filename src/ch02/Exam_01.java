package ch02;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//정수 타입의 변수 선언과 값 저장
		byte var1 = 0;  // -128~129까지의 수만 선언 가능
		byte var11 = 100;   //byte타입의 var1 변수를 선언하고 1을 저장한다.
		short var2 = 100;
		int var3 = 1;
		long var4 = 1;
		//실수 타입의 변수 선언과 값 저장
		float var5 = 0.123456789f; //출력하면 0.1234567 9 가뜸
		double var6 = 0.123456789; //double이 정밀도가 더 높음
		
		char var = 68; // X
		char var0 = 'A'; // O 아스키코드로 씀
		System.out.println(var);
		System.out.println(var0);
		
		//논리 타입의 변수 선언과 값 저장
		boolean var7 = true;
		boolean var8 = false;
		
		
	}

}
