// 두 정수 입력받아 합 구해 출력하는 프로그램.
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		System.out.print("두 정수를 입력하세요>>");
		
		scanner = new Scanner(System.in); 
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.print(a + "+" + b + "은 " + (a + b));
		scanner.close();
	}

}
