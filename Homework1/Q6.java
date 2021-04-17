import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.print("돈의 액수를 입력하세요>>");
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
			System.out.println("오만원"+ a + "개, 만원" + b + "개, 천원" + c +"개, 500원" + d +"개, 100원" + e+"개, 10원"+f+"개, 1원"+g+"개");
		}
			else
			System.out.println("유효한 돈의 액수가 아닙니다!");
		scanner.close();
	}

}
