package ch08exam11;

public class User {
	//Filed
	String id;
	String name;
	String password;		//�ν��Ͻ� �ʵ带 ���� (��ü �ȿ� �� ���) - ��ü�� �����ؾ� ��� ����, ��ü���� ���� �ٸ��� ������ ���� �� ����
	static String nation = "���ѹα�";		//static �����̱� ������ ���� �൵�ǰ� ���൵��
	//Constructor - �ν��Ͻ��� ����� �� �� ����(��ü�� �����ϱ����� �뵵�� ��, �ν��Ͻ��� �ɼ� ���� EX new Calculator() - �� �κ��� �ҷ����� �������;
	
	User(String name){
		this.name = name;
	}
	
	
	
	//method
	void login() {
		System.out.println(name +" ���� �α��� �մϴ�");
	}
	void logout() {
		System.out.println(name +" ���� �α׾ƿ� �մϴ�");
	}												//�ν��Ͻ� �޼ҵ�, ��ü�� �־�� ��� ���� login,logout �޼ҵ�� ��ü�� �־�� ����� ���� (name�� ����ϱ� ������)
	
	static void info() {									//��ü ���̵� ��� ����
		System.out.println("��� User�� �ѱ����Դϴ�.");
	}
}
