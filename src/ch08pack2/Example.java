package ch08pack2;

import java.util.Date;

import ch08pack1.Board;
//import ch08pack1.Board; ���� Ŭ������ Board�� �ִµ�, ���� �ٸ� ��Ű������ �ϳ��� ���� ������ �ϳ��� import�� �ϰ� �ٸ� �Ŵ� �ؿ� ���� �����
import ch08pack1.Product;
public class Example {

	public static void main(String[] args) {
		Board b1 = new Board();	//pack1���� ������ BoardŬ����
		b1.title = "����";
		
		Product p1 = new Product();
		p1.name = "��Ź��";
		
		Date now  = new Date();
		
		ch08pack3.Board b2 = new ch08pack3.Board();
	}

}
