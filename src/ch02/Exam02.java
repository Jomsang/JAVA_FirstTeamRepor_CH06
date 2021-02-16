package ch02;

public class Exam02 {

	public static void main(String[] args) {
		
		//자동 타입 변환
		byte var1 = 10;
		int var2 = var1;
		//작은 접시를 큰 접시에 넣는건 당연히 됨
		
		//강제 타입 변환
		int var3 = 1000;
		byte var4 = (byte) var3; // 쪼갠다.
		System.out.println(var4); //-24 엉뚱한 값이 나옴 애초에 값을 잃어버리면서까지 
		                          //타입을 바꿀 일이 없음. 애초에 값도 쪼개도 허용되는 값이 존재해야 함.

	
		//큰 접시를 작은 접시에는 절대 못 넣음 그래서 작은 단위로 쪼개야 함.
		//================================================
		int var5 = 10;
		double var6 = var5;
		// 정수 < 실수
		
		//강제 타입 변환
		float var7 = 10.5f;
		long var8 = (long)var7; //실수에서 정수로 변환은 소수 이하자리를 버림
		
		
		//-----------------------------------------------------
		
		double var9 = 3.14;
		int var10 =(int) var9;
		System.out.println(var10); //실수에서 정수로 변환은 소수 이하자리를 버림
		
		
		
		
		
		
	}

}
