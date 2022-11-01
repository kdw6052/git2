package day06;

import java.util.Scanner;

public class ArrayRandomEx01 {

	public static void main(String[] args) {
		// 랜덤으로 1~9사이의 숫자를 3개 생성하여 배열 저장하는 코드를 작성.
		int min =1,max=9;
		
		int rd[] = new int[3];
		for(int i=0;i<rd.length;i++) {
			rd[i]=(int)(Math.random()* (max - min + 1)+min);
			System.out.println("랜덤한 수 : "+rd[i]);
		}
		// 정수를 입력받아 랜덤한 수에 있는지 없는지 확인해서 알려주는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		boolean isDuplicated = false;//중복이 안됨으로 초기화
		
		for(int i=0;i<rd.length;i++) {
			//i번지에 있는 값과 num가 같으면
			if(num == rd[i]) {
				//중복됐다고 저장함
				isDuplicated = true;
				break;
			}
		}
		//중복 됐으면 있다고 출력하고 아니면 없다고 출력
		if(isDuplicated) {
			System.out.println(num+"가 있습니다.");
		}else {
			System.out.println(num+"가 없습니다.");
		}
		sc.close();
		
	}

}
