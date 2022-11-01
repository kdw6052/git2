package day03;

import java.util.Scanner;

public class IfEx08 {

	public static void main(String[] args) {
		/*	점수를 정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 	A : 90~100
		 * 	B : 80~89
		 * 	C : 70~79
		 * 	D : 60~69
		 * 	F : 0~59
		 * 	잘못된 성적 : 그외
		 * */
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >=90 && score <= 100) {
			System.out.println("A학점입니다.");
		}else if(score >=80 && score <90 ) {
			System.out.println("B학점입니다.");
		}else if(score >=70 && score <80 ) {
			System.out.println("C학점입니다.");
		}else if(score >=60 && score <70 ) {
			System.out.println("D학점입니다.");
		}else if(score >=0 && score <60 ) {
			System.out.println("F학점입니다.");
		}else {
			System.out.println("잘못된 성적입니다.");
		}
		sc.close();
		
	}

}
