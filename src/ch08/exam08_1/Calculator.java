package ch08.exam08_1;
import java.util.*;
public class Calculator {
	//오버로딩에 관한 설명
	double area(double w) {	//정사각형
		return w * w;
	}
	double area(double w, double h) {
		return w * h;
	}
	
	//원의 면적
	double areaCircle(double r) {	//
		return r * r * Math.PI;
	}
	
}
