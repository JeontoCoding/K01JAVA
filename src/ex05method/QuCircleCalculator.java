package ex05method;

import java.util.Scanner;

/*
문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 
메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.

 */
public class QuCircleCalculator {

	static void circleArea(double a) {
		double b = a;
		
		double m = (3.14 * b * b);
		System.out.println("원의 둘레(" + b + ") : " + m);
	}
	
	static void circleRound(double b) {
		double c = b;
		
		double n = (2 * 3.14 * c);
		System.out.println("원의 넓이(" + c + ") : " + n);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("둘레:");
		double sNum = scanner.nextDouble();
		System.out.print("넓이:");
		double eNum = scanner.nextDouble();
		
		circleRound(eNum);
		circleArea(sNum);
	}
	
	/*
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요:");
		double rad = scanner.nextDouble();
		
		circleRound(rad);
		//반환값이 있는 메서드이므로 print문 안에서 호출한다.
		System.out.print("원의 둘레는:"+ circleRound(rad);
	}
	
	//반환값이 없으므로 매개변수를 받은 후 결과를 즉시 출력한다.
	static void circleArea(double radian) { // 원의 넓이
		// 3.14 * 반지름 * 반지름
		double result = 3.14 * radian * radian;
		System.out.print("원의 넓이는 :"+ result);
	}
	
	static double circleRound(double radian) { // 원의 둘레
		// 2 * 3.14 * 반지름
		return (2 * 3.14 * radian);
	}
	 */

}
