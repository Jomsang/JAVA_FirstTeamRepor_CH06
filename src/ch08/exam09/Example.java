package ch08.exam09;

public class Example {

	public static void main(String[] args) {	//���ε� ��ü�� �ʿ����� �ʱ� ������ static�� ����
		
		//�ùٸ� ��� ���
		System.out.println(Calculator.PI);
		Calculator.plus(3, 5);
		
		//�߸��� ��� ���
		Calculator cal = new Calculator();
		System.out.println(cal.PI);
		cal.plus(3, 5);
	}

}
