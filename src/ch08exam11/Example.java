package ch08exam11;

public class Example {

	public static void main(String[] args) {
		//�ʵ�� ����Ÿ, �޼ҵ�� �ڵ� ���(��ü���� �޼ҵ嵵 ���� ������ �ſ� ��ȿ����) �׷��� �ʵ�� �������� ������ �޼ҵ�� �޼ҵ� ������ ���� ����.
		User user = new User("���λ�");	// - ��ü�� ����(���� ����) ������ ������ ���� ����
		
		//�ν��Ϥ��� ���(�ʵ�, �޼ҵ�)�� �ݵ�� 
		//��ü ���� ������ ���ؼ� ����(user ����)
		
		System.out.println(user.name);
		user.login();
		user.logout();
		
		user.info();				//static �޼ҵ带 ��ü�� ����ؼ� ���� ����� �����ϳ� ��� ��
		System.out.println(User.nation);
		User.info();	//��ü ���̵� ���� ���(static�� ���� �ʵ� �� �޼ҵ�) ���� ��밡��
	}

}
