package ch08exam13;

public class Example {

	public static void main(String[] args) {
	
		//Singleton result44 = new Singleton();// �Ʒ��� ���� ��ü ������! ������ new�� ��� �����ϱ� ������ ��ȿ���� , Singleton()Ŭ�������� private������ ���༭ ������
		
		
		//��ü ���α׷����� �� �ϳ��� ��ü�� ���� �����ؼ� ��� �� ���� �̰� �ߺ����� ���� �ξ� ����
		Singleton result4 = Singleton.getInstance(); // ������ �޼ҵ��� ���� ������ ��ü�� �����ؼ��� ��� ����!!, "���丮 �޼ҵ�"��� ��
		Singleton result6 = Singleton.getInstance();
		if(result4 == result6) {
			System.out.println("���� ��ü�� ����");
		}
		else {
			System.out.println("�ٸ� ��ü�� ����");	//�ٸ� ������ �ֳ��ϸ� getInstance �޼ҵ� �ȿ��� �θ� �� ���� ��ü�� �����ϱ� ������ ���� �ٸ� ��ü�� ����!
		}
		
		
		
	}

}
