package ch08exam13;

public class Singleton {
	
	private static Singleton singleton = new Singleton();	//��ü ������ ����, �����ʵ带 ����
	
	
	
	
	private Singleton() {	//�����ڸ� ���� ��� , private�� �ؼ� �ٸ� Ŭ�������� new �� ����ؼ� Singleton ��ü�� ���� �� ��.(������ ���ؼ� �̷� �����ε� Ȱ��)
		
	}
	
	static Singleton getInstance() {	//���丮 �޼ҵ带 ���� Singleton�� ��� �� �� ����!
		//Singleton s = new Singleton();	//�ٸ� ��ü�� ����
		
		//return s;
		return singleton;	//ȣ�� �� ������ ���� ��ü�� �����ϰ� �Ϸ��� �ʵ忡�� static�ʵ�� ��ü�� ���� ����.
	}
	//���� �ٲ� �� ���� �ʵ带 final �ʵ�
	
	//final ���� �ν��Ͻ� ������ �����ڸ� ���ؼ� �� 1�� �ٲ� �� �ִ� ��ȸ�� ��.
	
	
	
	
	
}
