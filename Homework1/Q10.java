import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String coffee = scanner.next();
		int n = scanner.nextInt();
		if(coffee.equals("����������")) {
			if(n >= 10)
				System.out.println((int)((2000 * n) * 0.95) + "���Դϴ�.");
			else
				System.out.println(2000 * n + "���Դϴ�.");
		}
		else if(coffee.equals("�Ƹ޸�ī��"))
			System.out.println(2500 * n + "���Դϴ�.");
		else if(coffee.equals("īǪġ��"))
			System.out.println(3000 * n + "���Դϴ�.");
		else
			System.out.println("�޴��� �����ϴ�!");
		scanner.close();
	}

}
