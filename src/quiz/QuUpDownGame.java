package quiz;

import java.util.Random;
import java.util.Scanner;

class NumberRangeException extends Exception {
	
	public NumberRangeException() {
		super("[예외발생] 1 ~ 100 숫자만 입력하세요");
	}
}

public class QuUpDownGame {

	public static void main(String[] args) {
		
		System.out.println("숫자 1~100 랜덤으로 뽑혔습니다.");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int com = random.nextInt(10000)%100+1;
		
		int i = 1;
		while(true) {
			
			int pla = 1;
			System.out.print(com);
			
			try {
				System.out.print("숫자 입력해주세요: ");
				pla = sc.nextInt();
				
				if(pla < 1 || pla >100) {
					NumberRangeException nre = new NumberRangeException();
					throw nre;
				}
			}
			catch(NumberRangeException e) {
				System.out.println(e.getMessage());
			}
			 
			if(!(pla < 1 || pla > 100)) {
				if(com == pla) {
					System.out.println("정답입니다.");
				}
				else if(com > pla) {
					System.out.println("업");
					i++;
				}
				else if(com < pla) {
					System.out.println("다운");
					i++;
				}
				else if(i == 7) {
					System.out.println("실패!");
				}
			}
			
			
			if(i >= 7 || (com == pla)) {
				System.out.print("계속 하시겠습니까? 재시작(1) 종료(0) : ");
				int re = sc.nextInt();
				if(re == 0) {
					break;
				}
				else {
					System.out.println("다시 시작");
					i = 1;
				}
			}
		}
		

	}

}
