import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ���� ó�� ��� 0���� ������ ���� �ߴ� ����
//		Scanner scanner = new Scanner(System.in);
//		int dividend; // ������
//		int divisor; // ������
//		
//		System.out.print("�������� �Է��Ͻÿ�.");
//		dividend = scanner.nextInt(); // ������ �Է�
//		System.out.print("�������� �Է��Ͻÿ�. ");
//		divisor = scanner.nextInt();
//		System.out.println(dividend + "��" + divisor +"�� ������ ���� "
//				+ dividend/divisor + "�Դϴ�.");
		
		Scanner scanner = new Scanner(System.in);
		int dividend; // ������
		int divisor; // ������
		
		System.out.print("�������� �Է��Ͻÿ�.");
		dividend = scanner.nextInt(); // ������ �Է�
		System.out.print("�������� �Է��Ͻÿ�. ");
		divisor = scanner.nextInt(); // ������ �Է�
		try {
			System.out.println(dividend + "��" + divisor +"�� ������ ���� "
					+ dividend/divisor + "�Դϴ�.");
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�!");
		}
		finally {
			scanner.close(); // �������̵� ���� �߻��ϵ� ���������� scanner close
		}
	}

}
