import java.util.Vector;
import java.util.Scanner;

public class VectorHeight {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.print("2000~2009����� 1�� ������ Ű(cm)�� �Է�\n>>");
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			v.add(scanner.nextInt());
		}
		
		int max = 0;
		int max_index = 0;
		
		for(int i = 0; i < 9; i++)
		{
			if(max < v.get(i + 1) - v.get(i)) {
				max = v.get(i + 1) - v.get(i);
				max_index = i;
			}
		}
		System.out.println("���� Ű�� ���� �ڶ� �⵵�� " + (int)(2000 + max_index) + "�� " + (float)max + "cm");
		scanner.close();
	}

}
