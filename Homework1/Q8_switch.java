import java.util.Scanner;

public class Q8_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String coffee = scanner.next();
		int n = scanner.nextInt();
		
		switch(coffee) {
			case "īǪġ��":
				System.out.println(3000 * n + "���Դϴ�.");
				break;
			case "�Ƹ޸�ī��":
				System.out.println(2500 * n + "���Դϴ�.");
				break;
			case "����������":
				System.out.println(2000 * n + "���Դϴ�.");
				break;
			default:
				System.out.println("�޴��� �����ϴ�!");
		}		
		scanner.close();
	}
}
