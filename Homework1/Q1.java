// �� ���� �Է¹޾� �� ���� ����ϴ� ���α׷�.
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		System.out.print("�� ������ �Է��ϼ���>>");
		
		scanner = new Scanner(System.in); 
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.print(a + "+" + b + "�� " + (a + b));
		scanner.close();
	}

}
