package ex08class;

class CalculatorEx {
	
	int addUp;
	double minUp;
	double mulUp;
	int divUp;
	
	void init() {
		addUp = 0;
		minUp = 0;
		mulUp = 0;
		divUp = 0;
	}
	
	double add(double a, double b) {
		addUp++;
		double addab = a + b;
		
		return addab;
	}
	
	double min(double a, double b) {
		minUp++;
		
		double minab = a - b;
		
		return minab;
	}
	
	double mul(double a, double b) {
		mulUp++;
		double mulab = a * b;
		
		return mulab;
	}
	
	double div(double a, double b) {
		divUp++;
		double divab = a / b;
		
		return divab;
	}
	
	void showOpCount() {
		System.out.printf("덧셈횟수:%d\n 뺄셈횟수:%.2f\n 곱셈횟수:%.2f\n 나눗셈횟수:%d\n"
				, addUp, minUp, mulUp, divUp);
	}
	
	
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();



	}
	
	
	/*
	class CalculatorEx {
		
		//계산의 횟수 카운트 위한 멤버변수
		int addNum;
		int minNum;
		int mulNum;
		int divNum;
		
		//멤버변수 초기화 메서드
		void init() {
			int addNum; = 0;
			int minNum; = 0;
			int mulNum; = 0;
			int divNum; = 0;
		}
		
		//사친연산 수행
		void add(double num1, double num2) {
			addNum++;
			return num1 + num2;
		}
		void min(double num1, double num2) {
			minNum++;
			return num1 - num2;
		}
		void mul(double num1, double num2) {
			mulNum++;
			return num1 * num2;
		}
		void div(double num1, double num2) {
			divNum++;
			return num1 / num2;
		}
		
		//연산의 횟수 출력
		void showOpCount() {
			
			System.out.println("덧셈횟수 : "+addNum);
			System.out.println("뺄셈횟수 : "+minNum);
			System.out.println("곱셈횟수 : "+mulNum);
			System.out.println("나눗셈횟수 : "+divNum);
		}
	}
	
	
	public class QuSimpleCalculator{
		public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
		 
		}
	
	}
	 */

}
