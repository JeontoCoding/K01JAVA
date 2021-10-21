package ex08class;

class Triangle {
	
	int Bottom;
	int Height;
	
	void init(int bot, int hei) {
		this.Bottom = bot;
		this.Height = hei; // 둘다 this. 붙이자(매개변수니까)
	}
	
	void setBottom(int bot) {
		this.Bottom = bot; //this 붙일것
	}
	
	void setHeight(int hei) {
		this.Height = hei; //this 붙일 것
	}
	
	double getArea() {
		double Area = Bottom * Height *0.5;
		
		return Area;
	}
}

public class QuTriangle {

	public static void main(String[] args) {
		
		// 밑변 x 높이 /2 = 넓이
		
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());


	}
	
	/*
	class Triangle {
		
		//멤버변수
		int bottom;//밑변
		int height;//높이
		
		//밑변과 높이를 초기화
		void init(int bottom, int height) {
			this.bottom = bottom;
			this.height = height;
		}
		
		//밑변을 변경
		void setBottom(int bottom) {
			this.bottom = bottom;
		}
		
		//높이를 변경
		void setHeight(int height) {
			this.height = height;
		}
		
		//삼각형의 넓이를 계산 후 반환
		double getArea() {
			return (bottom * height * 0.5);
		}
	}
	
	
	public class QuTriangle {
		
		public static void main(String[] args) {
		
			Triangle t = new Triangle();
			t.init(10, 17); //밑변10, 높이17로 초기화
			System.out.println("삼각형의 넓이 : " + t.getArea());
			t.setBottom(50);//밑변 50으로 변경
			t.setHeight(14);//높이 14로 변경
			System.out.println("삼각형의 넓이 : " + t.getArea());
		}
	}
	 */

}



