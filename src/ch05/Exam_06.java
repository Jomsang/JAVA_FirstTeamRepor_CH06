package ch05;

import java.util.Arrays;

public class Exam_06 {

	public static void main(String[] args) {
		//새로운 배열을 int 값이 3개 들어가는것을 생성 
		String[] arr1 = new String[3];
		
		
		//배열 인덱스 값 출력
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		//배열 항목의 값에 '번지'(주소)를 저장
		arr1[0] = "Hi";
		arr1[1] = "My name is";
		arr1[2] = "Cho minsang";
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]+" ");
		}
		
		System.out.println(arr1[0].equals("Hi"));
		System.out.println(!(arr1[0].equals("AA")));
		System.out.println(arr1[0] == "Hi");
	}
	

}
