package ex06array;

import java.util.Scanner;

/*
문제1) 파일명 : QuSungJuk.java
다음 조건에 맞는 프로그램을 작성하시오.
1] 학생수를 사용자로부터 입력받는다.
	-Scanner클래스 사용
2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
	-Scanner클래스 사용
4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
5] 이 문제는 2차원 배열을 활용하는 문제이다.

 */
public class QuSungJuk {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int hak;
		
		
		
		System.out.print("학생수를 입력하세요?");
		hak = scanner.nextInt();
	
		int[][] arr = new int[hak][5];
		for(int i =0; i<3; i++) {
			for(int j =0; j<5; j++) {
				arr[i][j] = i + j;
			}
			System.out.println();
		}
		
		System.out.println("테스트");
		
		for(int i = 0; i<3; i++) {
			System.out.println("["+(i+1)+"번째 학생의 점수 입력]");
			for(int j = 0; j<1; j++) {
				int kor, eng, mat;
				System.out.print("국어점수 입력?");
				arr[i][0] = scanner.nextInt();
				System.out.print("영어점수 입력?");
				arr[i][1] = scanner.nextInt();
				System.out.print("수학점수 입력?");
				arr[i][2] = scanner.nextInt();
			}
			arr[i][3] = arr[i][0]+arr[i][1]+arr[i][2];
		}
		
		for(int i = 0; i<3; i++) {
			System.out.printf("%d %d %d %d %d %.2f\n", i+1, arr[i][0], arr[i][1]
					, arr[i][2], arr[i][3], (arr[i][3])/3.0);
			}			
	}
	
	
	/*
	public static void main(String[] args)	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생수 입력:");
		int numberOfStudent	= scanner.nextInt();
		
		//학생의 점수와 총점, 평균을 입력할 2차원배열 선언
		int[][] jumsuArr = new int[numberOfStudent][5];
		
		//입력받은 학생수만큼 반복
		for(int i = 0; i<numberOfStudent; i++) {
			
			//국,영,수 점수를 입력받은 후...
			System.out.print("국어점수 입력:");
			int kor	= scanner.nextInt();
			System.out.print("영어점수 입력:");
			int eng	= scanner.nextInt();
			System.out.print("수학점수 입력:");
			int math	= scanner.nextInt();
			
			//배열에 입력한다.
			jumsuArr[i][0] = kor;
			jumsuArr[i][1] = eng;
			jumsuArr[i][2] = math;
		}
		
		//총점과 평균을 구한다.
		for(int i=0; i<numberOfStudent; i++) { // 학생을 의미
			int sum = 0; //학생 한명의 총점
			for(int j=0; j<3; j++) { // 과목을 의미
				
				//i번째 학생의 국,영,수 점수의 총점을 구함
				sum += jumsuArr[i][j];
			}
			jumsuArr[i][3] = sum; //총점을 배열에 입력
			jumsuArr[i][4] = sum / 3; // 평균을 배열에 입력
		}
		
		//결과출력
		System.out.printf("No Kor Eng Math Tot Avg%n");
		for(int i=0; i<numberOfStudent; i++) { // 학생을 의미
			System.out.print((i+1)+"  "); // 학생의 순번
			for(int j=0; j<5; j++) { //과목, 총점, 평균까지 출력
				System.out.printf("%4d ", jumsuArr[i][j]);
			}
			System.out.println();
		}
	}
	
	 */
		
		
}


