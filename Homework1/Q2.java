// 한 층 높이 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력.
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		System.out.println("몇 층인지 입력하세요>>");
		
		scanner = new Scanner(System.in);
		int floor = scanner.nextInt();
		
		System.out.println(floor*5 + "m " + "입니다.");	
		scanner.close();
	}

}
