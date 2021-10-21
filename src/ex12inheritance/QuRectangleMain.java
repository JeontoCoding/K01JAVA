package ex12inheritance;

/*
문제3) QuRectangleMain.java
정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 
아래의 소스를 참조하여 구현하시오.

 */

//직사각형을 표현한 클래스
class Rectangle
{
      int width;
      int height;
     
      //멤버변수가 2개이므로 인자가 2개인 생성자가 필요
     public Rectangle(int width, int height) {
    	 this.width = width;
    	 this.height = height;
     }
     
     //이거 굳이 안넣었어도 충분히 할 수 있었음
     int rec() {
    	 int recBh = width * height;
    	 
    	 return recBh;
     }
     
     void ShowAreaInfo() {
    	 System.out.println("직사각형 면적: " + rec());// (width * height)); 이렇게 했어도 됨.
     }
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	int width;
	
		/*
		정사각형은 직사각형의 일종이고, 가로/세로의 길이가
		동일하므로 하나의 값으로 두개의 멤버변수를 초기화 할수 있다.
		따라서 자식에서 멤버변수에 대한 확장도 필요없다.
		 */
     	public Square(int width) {
     		super(width, width);
     		
     	}
     	
     	// 이것도 마찬가지로 필요없음.
     	int sqr() {
     		int sqrLl = width * width;
     		
     		return sqrLl;
     	}
     	
     	// 이 부분은 놓침
     	@Override
     	void ShowAreaInfo()
     	{
     		System.out.println("정사각형 면적: " + rec());
     	}
}

class QuRectangleMain {
	public static void main(String[] args) {
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.ShowAreaInfo();

     		Square sqr = new Square(7);
	       	sqr.ShowAreaInfo();
 	}
}

