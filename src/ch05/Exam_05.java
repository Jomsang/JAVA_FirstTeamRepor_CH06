package ch05;

import java.util.Arrays;

public class Exam_05 {

	public static void main(String[] args) {
		//새로운 배열을 int 값이 3개 들어가는것을 생성 
		int[] arr1 = new int[3];
		
		
		//배열 인덱스 값 출력
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		//배열 항목의 값에 값이 저장됨
		arr1[0] = 90;
		arr1[1] = 80;
		arr1[2] = 95;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		//배열 항목 비교 
		System.out.println(arr1[0] == 90);
		System.out.println(arr1[0] != 80);
	}
	

}
