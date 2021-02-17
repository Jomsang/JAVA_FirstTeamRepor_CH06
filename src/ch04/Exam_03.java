package ch04;

import java.util.*;

public class Exam_03 {

	public static void main(String[] args) {
		// 주사위를 던져 나오는 수 얻기(1, 2, 3, 4, 5, 6)

		double temp = Math.random();
		System.out.println(temp); // .random() - Math클래스에서 메소드 호출
									// [0, 1) - 0은 포함하지만, 1은 포함하지 않는다는 뜻
									// [0, 1) 0이상 1미만의 실수 값들이 랜덤으로 나온다는 뜻
		System.out.println(temp * 6); // [0, 6) - 0이상 6미만의 실수들
		System.out.println((int) (temp * 6 + 1)); // 1 을 더해주면 7미만 (즉 6도 포함)

		int value = (int) ((temp * 6) + 1);

		if (value % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}

}
