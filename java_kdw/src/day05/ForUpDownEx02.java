package day05;

import java.util.Scanner;

public class ForUpDownEx02 {

	public static void main(String[] args) {
		/*	랜덤한 정수를 맞추는 up down 게임
		 * 	더하시겠습니까y/n 입력하기
		 * 	
		 * 
		 * 
		 * */
		int min=1,max=100;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(min+"~"+max+"사이의 랜덤한 수를 맞추세요");
		int num=min-1;
		
		for(;;) {
			int r = (int)(Math.random()* (max - min + 1)+min);
			for(;num!=r;) {
				System.out.print("숫자를 입력하세요 : ");
				num = sc.nextInt();
				if(num==r) {
					System.out.println("정답입니다.");
				}else if(num<r) {
					System.out.println("Up");
				}else {
					System.out.println("Down");
				}
				
				}
			System.out.println("한판더 하시겠습니까?(y/n)");
			if(sc.next().charAt(0)=='n') {
				break;
			}
		
		}System.out.println("프로그램을 종료합니다.");

	}

}
