package ch08.exam10;

public class Example {

	public static void main(String[] args) {
		Changer c1 = new Changer();
		
		//Call by value (값을 복사해서 호출)
		int value = 1;
		c1.change(value);
		System.out.println(value);	//1이 2로 바뀌지 않음, Changer에 있는 
//		void change(int value) {
//					value = 2;
//		}에 값이 복사만 되는거지 참조가 되는 것은 아님.(즉 example의 value랑 Changer의 value랑 다른 변수)
		
		
		
		
		
		
		
		
		
		
		
		//Call by Reference(번지를 복사해서 호출)
		String v3 = "A";	//String은 참조 타입이기 때문에 "A"라는 정보의 주소를 v3가 담고있음
		c1.change(v3);		//v3의 번지("A"를 담는 객체의 주소)가 전달 됨
		System.out.println(v3);//이것도 B가 되지않고 A가 출력   Changer의 void change(String value) 메소드에 value = "B";를 했기 때문에 c1.change(v3);를 받아도
		// void change(String value) 메소드에 value = "B"는 value가 "B"를 참조하는 객체가 됨, A를 참조하는 객체가 되지 않음.
		
		
		
		
		
		

		//Call by Reference(번지를 복사해서 호출)
		int []arr1 = {0, 0, 0};
		c1.change(arr1); //번지가 전달 됨.
		System.out.println(arr1[0]);	//arr[0]에 2가 넣어지게 됨, 같은 배열을 참조했기 때문에 수정이 가능한것 (call by value, call by reference 의 차이점)
		
		
		String[] arr3 = {"A", "B", "C"};
		c1.change(arr3);
		System.out.println(arr3[0]);	//위와 마찬가지로 같은 배열을 참조해서 arr[0]이 "B"로 바뀜
		
		
		
		
		
		
		
		
		
		
		Member m1 = new Member();
		System.out.println(m1.age);
		c1.change(m1);
		System.out.println(m1.age);
		
		
		
		//콜바이밸류는 값을 복사해서 다른 변수에 붙이기만 하지, 원래의 복사된 값은 더 이상 영향이 안감.(복사만 해줬으면 끝)
		//콜바이 레퍼런스는 객체의 번지가 복사되기 때문에 다른 변수가 참조가능한데! !!String만은 예외(바꿀수가 없고 문자열이 처음에 주워지면 더 이상 바꿀수 없음)!!
	}
	
	
	
	
	

}
