package ch08.exam10;

public class Example {

	public static void main(String[] args) {
		Changer c1 = new Changer();
		
		//Call by value (���� �����ؼ� ȣ��)
		int value = 1;
		c1.change(value);
		System.out.println(value);	//1�� 2�� �ٲ��� ����, Changer�� �ִ� 
//		void change(int value) {
//					value = 2;
//		}�� ���� ���縸 �Ǵ°��� ������ �Ǵ� ���� �ƴ�.(�� example�� value�� Changer�� value�� �ٸ� ����)
		
		
		
		
		
		
		
		
		
		
		
		//Call by Reference(������ �����ؼ� ȣ��)
		String v3 = "A";	//String�� ���� Ÿ���̱� ������ "A"��� ������ �ּҸ� v3�� �������
		c1.change(v3);		//v3�� ����("A"�� ��� ��ü�� �ּ�)�� ���� ��
		System.out.println(v3);//�̰͵� B�� �����ʰ� A�� ���   Changer�� void change(String value) �޼ҵ忡 value = "B";�� �߱� ������ c1.change(v3);�� �޾Ƶ�
		// void change(String value) �޼ҵ忡 value = "B"�� value�� "B"�� �����ϴ� ��ü�� ��, A�� �����ϴ� ��ü�� ���� ����.
		
		
		
		
		
		

		//Call by Reference(������ �����ؼ� ȣ��)
		int []arr1 = {0, 0, 0};
		c1.change(arr1); //������ ���� ��.
		System.out.println(arr1[0]);	//arr[0]�� 2�� �־����� ��, ���� �迭�� �����߱� ������ ������ �����Ѱ� (call by value, call by reference �� ������)
		
		
		String[] arr3 = {"A", "B", "C"};
		c1.change(arr3);
		System.out.println(arr3[0]);	//���� ���������� ���� �迭�� �����ؼ� arr[0]�� "B"�� �ٲ�
		
		
		
		
		
		
		
		
		
		
		Member m1 = new Member();
		System.out.println(m1.age);
		c1.change(m1);
		System.out.println(m1.age);
		
		
		
		//�ݹ��̹���� ���� �����ؼ� �ٸ� ������ ���̱⸸ ����, ������ ����� ���� �� �̻� ������ �Ȱ�.(���縸 �������� ��)
		//�ݹ��� ���۷����� ��ü�� ������ ����Ǳ� ������ �ٸ� ������ ���������ѵ�! !!String���� ����(�ٲܼ��� ���� ���ڿ��� ó���� �ֿ����� �� �̻� �ٲܼ� ����)!!
	}
	
	
	
	
	

}
