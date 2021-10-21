package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuBaseballGame {

	public static void main(String[] args) {
		
		int[] com = new int[3];
		int[] user = new int[3];
		
		int re;
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		
		while(true) {
			
			for(int i = 0; i<3; i++) {
				com[i] = ran.nextInt(10000)% 9 + 1;
				
				for(int j = 0; j<i; j++) {
					if(com[j]==com[i]) {
						i--;
					}
				}
			}
			System.out.print(com[0]+ " ");
			System.out.print(com[1]+ " ");
			System.out.print(com[2]);
			System.out.println();
			
			int strake =0;
			int ball = 0;
			int out =0;
			int count=0;
			
			
			
			for(int i =0; i<user.length; i++) {
				System.out.println("숫자를 입력해주세요 : ");
				user[i] = sc.nextInt();
				for(int j = 0; j<com.length; j++) {
					if(com[i]==user[j] && i==j) {
						strake++;
						System.out.println("strake!");
					}
					else if(com[i]==user[j] && i!=j) {
						ball++;
						System.out.println("ball!");
					}
					else if(com[i]!=user[j] && i!=j) {
						out++;
					}
				}
			}
			count++;
			System.out.println("시도횟수" + count);
			
			if(strake==3) {
				System.out.println("strake 3번! 게임 종료!");
			}
			else if(ball==3) {
				System.out.println("아웃!");
			}
			else {
				System.out.println("다시!");
				break;
			}
			
			
			while(true) {
				System.out.println("재시작 하시겠습니까? 재시작(0) 종료 (1)");
				re = sc.nextInt();
				if(re==1) {
					return;
				}
				else if(re==0) {
					break;
				}
			}
			count=0;
			
		}
	}

}
