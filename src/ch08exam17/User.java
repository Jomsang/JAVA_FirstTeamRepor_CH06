package ch08exam17;

public class User {
	//Field
	private String id;
	private String name;				//�������� ���Ἲ�� ���� private�� ���̰� ���Ϳ� ���͸� ���� ���� �а� ��� ��.
										//�޴� Source�� ���ͼ��� �����ϸ� �ڵ��ϼ� ����(���� ����  ��� �� ����)
	private String password;
	private int age;
	private boolean adult;
	//�޼ҵ�

	//setter
	public void setAge(int age) {//****�߿��ϴ� �� �˾Ƶα� //private int age; �������� ���Ἲ�� ���� ���� �� ��
		if(age < 0) {				//���Ϳ� ���� �Ѵ� �Ǹ� ����� �б� �Ѵ� ���� (���̴� ���� �����ϴϱ�, ����� �����̱⶧���� ���常 ����)
			this.age = 0;
			
		}else {
			
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}
	
	
	public void setPassword(String password) {	//setter�� �����Ǹ� ���常�ϰ� ������ ����
		this.password = password;
	}
	//--------------------------------------------------------------------------------------------���� ����� �޴µ� ��������� �� ����
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public boolean isAdult(boolean adult) { //boolean���� ���� �ϴ� �޼ҵ�� �޼ҵ� �̸� �տ� is�� �ٿ��ִ°��� ����
		return adult;
	}
	
	


}
