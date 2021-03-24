// 점수와 학년 입력받아 60점 이상이면 합격, 아니면 불합격 출력
// 4학년은 70점 이상이어야 합격
// 60점 이상인 경우 4학년 구분해 처리

import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100점): ");
		int score = scanner.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		int year = scanner.nextInt();
		
		if(score >= 60) {
			if(year != 4)
				System.out.println("합격!"); // 4학년 아닐 때 60점 이상이면 합격
			else if(score >= 70)
				System.out.println("합격!"); // 4학년일땐 70점 이상이면 합격
			else
				System.out.println("불합격!");
		}
		else
			System.out.println("불합격!");
		
		scanner.close();
			
	}

}
