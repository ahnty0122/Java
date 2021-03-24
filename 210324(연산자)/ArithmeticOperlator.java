import java.util.Scanner;

public class ArithmeticOperlator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner;
			// int x; 랑 똑같음
			
			scanner = new Scanner(System.in);
			
			System.out.print("정수를 입력하세요");
			int time = scanner.nextInt(); // 정수 입력
			int second = time % 60; // 초
			int minute = (time / 60) % 60; // 분
			int hour = (time / 60) / 60; // 시간
			
			System.out.print(time + "초는 ");
			System.out.print(hour + "시간, ");
			System.out.print(minute + "분, ");
			System.out.print(second + "초입니다.");
			scanner.close();			
	}

}
