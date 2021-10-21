package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuRockPaperScissors
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
	
		int i = 1;
		while(true) {
			try {
				int com = ((int)((Math.random()*100) % 3)+1);
				System.out.println("컴퓨터 : "+ com);
				System.out.println("무엇을 내겠습니까? (1:가위, 2:바위, 3:보)");
				int sci = scan.nextInt();
				
				if(i == 5) {
					System.out.print("재시작 하시겠습니까? 재시작(0) 종료(1):");
					int re = scan.nextInt();
					if(re == 0) {
						i=1;
					}
					else {
						return;
					}
				}
					
				switch(sci) {
				case 1: // 1 은 가위
					if(com == 3) {
						i++;
						System.out.println("이겼습니다.");
					}else if(com == 1){
						i++;
						System.out.println("비겼습니다.");
					}else {
						i++;
						System.out.println("졌습니다.");		
					}
					break;
				case 2: // 2는 바위
							
					if(com == 1) {
						i++;
						System.out.println("이겼습니다.");
					}else if(com == 2){
						i++;
						System.out.println("비겼습니다.");
					}else {
						i++;
						System.out.println("졌습니다.");	
					}
					break;
				case 3: // 3은 보
					if(com == 2) {
						i++;
						System.out.println("이겼습니다.");
					}else if(com == 3){
						i++;
						System.out.println("비겼습니다.");
					}else {
						i++;
						System.out.println("졌습니다.");
							}
					break;	
				default:
					System.out.println("잘못 입력했습니다.");
					break;	
				}
			}
			catch(InputMismatchException e) {
				System.out.println("숫자로 입력해주세요");
				scan.nextLine();
			}
			
			
		}
			
	}
		
}


