import java.util.Scanner;

public class Q8_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.print("커피 주문하세요>>");
		String coffee = scanner.next();
		int n = scanner.nextInt();
		
		if(coffee.equals("카푸치노"))
			System.out.println(3000 * n + "원입니다.");
		else if(coffee.equals("아메리카노"))
			System.out.println(2500 * n + "원입니다.");
		else if(coffee.equals("에스프레소"))
			System.out.println(2000 * n + "원입니다.");
		else
			System.out.println("메뉴에 없습니다!");
		
		scanner.close();
	}

}
