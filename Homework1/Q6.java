import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.print("���� �׼��� �Է��ϼ���>>");
		int money = scanner.nextInt();
		int a, b, c, d, e, f, g;
		if(money >= 0)
		{
			a = money / 50000;
			b = (money - 50000 * a) / 10000;
			c = (money - 50000 * a - 10000 * b) / 1000;
			d = (money - 50000 * a - 10000 * b - 1000 * c) / 500;
			e = (money - 50000 * a - 10000 * b - 1000 * c - 500 * d) / 100;
			f = (money - 50000 * a - 10000 * b - 1000 * c - 500 * d - 100 * e) / 10;
			g = money - 50000 * a - 10000 * b - 1000 * c - 500 * d - 100 * e - 10 * f;
			System.out.println("������"+ a + "��, ����" + b + "��, õ��" + c +"��, 500��" + d +"��, 100��" + e+"��, 10��"+f+"��, 1��"+g+"��");
		}
			else
			System.out.println("��ȿ�� ���� �׼��� �ƴմϴ�!");
		scanner.close();
	}

}
