package ch08pack2;

import java.util.Date;

import ch08pack1.Board;
//import ch08pack1.Board; 같은 클래스인 Board가 있는데, 각각 다른 패키지에서 하나씩 쓰고 싶으면 하나는 import로 하고 다른 거는 밑에 직접 줘야함
import ch08pack1.Product;
public class Example {

	public static void main(String[] args) {
		Board b1 = new Board();	//pack1에서 가져온 Board클래스
		b1.title = "제목";
		
		Product p1 = new Product();
		p1.name = "세탁기";
		
		Date now  = new Date();
		
		ch08pack3.Board b2 = new ch08pack3.Board();
	}

}
